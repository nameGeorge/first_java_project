package org.example;

public class Calculator {
    public static String runCalculator() {
        int first = Input.scan();
        char operator = Input.readChar();
        int second = Input.scan();

        String result;
        switch (operator) {
            case '+':
                 result = Integer.toString(first + second);

                break;
            case '-':
                result = Integer.toString(first - second);

                break;
            case '*':
                result = Integer.toString(first * second);

                break;
            default:
                result = "Error";

        }


        return result;
    }

}


