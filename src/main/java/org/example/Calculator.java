package org.example;

public class Calculator {
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';

    public static void runCalculator() {
        int first = Input.scanInt();
        char operator = Input.scanChar();
        int second = Input.scanInt();

        switch (operator) {
            case PLUS:
                System.out.println(first + second);
                break;
            case MINUS:
                System.out.println(first - second);
                break;
            case MULTIPLY:
                System.out.println(first * second);
                break;
            default:
                System.out.println("Error");
        }
    }
}
