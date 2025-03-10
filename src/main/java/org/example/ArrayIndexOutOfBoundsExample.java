package org.example;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[3]); // Попытка доступа к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}