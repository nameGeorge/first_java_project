package org.example;

public class Calculator {
    public static void runCalculator() {

        int first = Input.scan();

        char operator = Input.readChar();

        int second = Input.scan();

        switch (operator) {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            default:
                System.out.println("Error");
        }
    }

}



