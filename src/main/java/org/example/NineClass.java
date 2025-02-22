package org.example;

public class NineClass {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2025;

        boolean result = isLeapYear(year);
        
        System.out.println("Год " + year + " високосный? " + result);
    }
}
