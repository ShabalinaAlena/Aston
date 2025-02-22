package org.example;

public class SixClass {

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное.");
        } else {
            System.out.println("Число " + number + " отрицательное.");
        }
    }

    public static void main(String[] args) {
        checkNumberSign(3);   // Положительное
        checkNumberSign(-1);   // Отрицательное
        checkNumberSign(0);    // Положительное
    }
}