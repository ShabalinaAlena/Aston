package org.example;

import java.util.*;

class PhoneDirectory {
    private final Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}