package org.example;

public class ThirteenClass {
    public static void main(String[] args) {
        int size = 7;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        System.out.println("Заполненный массив:");
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}