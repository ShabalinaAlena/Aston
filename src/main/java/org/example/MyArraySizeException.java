package org.example;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message, int row, int col) {
        super(message + " at row " + row + ", column " + col);
    }
}
