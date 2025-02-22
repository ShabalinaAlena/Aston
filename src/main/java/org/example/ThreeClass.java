package org.example;

public class ThreeClass {
    public static void main(String[] args) {
        int value = 20;
        if (value <= 0) {
             System.out.println("красный");
        }
        else if (value > 0  & value <= 100) {
            System.out.println("желтый");
        }
        else{
            System.out.println("зелёный");
        }
    }
}
