package org.example;

public class Calculator {
    public static String runCalculator() {
        int first = Input.scan();
        char operator = Input.readChar();
        int second = Input.scan();


        return switch (operator) {
            case '+' -> Integer.toString(first + second);
            case '-' -> Integer.toString(first - second);
            case '*' -> Integer.toString(first * second);
            default -> "Error";
        };
    }

}


