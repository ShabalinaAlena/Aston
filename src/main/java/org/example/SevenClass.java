package org.example;

public class SevenClass {

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        int number = -8;

        boolean result = isNegative(number);

        System.out.println("Число " + number + " отрицательное? " + result);
    }
}