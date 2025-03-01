package org.example;

public class Product2 {
        public static void main(String[] args) {
            Product[] productArray = new Product[5];

            productArray[0] = new Product("Samsung S25 ULtra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
            productArray[1] = new Product("Apple. 16 Pro Max", "13.07.2024", "Apple Inc.", "USA", 999, true);
            productArray[2] = new Product("Xiaomi 12 Lite", "09.09.2024", "Xiaomi", "Chine", 1519, false);
            productArray[3] = new Product("OnePlus 12", "05.05.2024", "OnePlus", "Chine", 999, false);
            productArray[4] = new Product("Pixel 7", "05.05.2023", "Google", "USA", 3999, true);

            for (Product product : productArray) {
                product.displayInfo();
                System.out.println();
            }
        }
    }
