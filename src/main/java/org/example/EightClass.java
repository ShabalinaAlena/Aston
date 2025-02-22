package org.example;

public class EightClass {
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printStringMultipleTimes("Aston - beautiful", 5);
    }
}

