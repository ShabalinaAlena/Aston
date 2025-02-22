package org.example;

public class FiveClass {

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 8;

        boolean result = checkSumRange(a, b);

        System.out.println("Сумма чисел " + a + " и " + b + " лежит в диапазоне от 10 до 20? " + result);
    }
}