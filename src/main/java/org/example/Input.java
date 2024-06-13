package org.example;

import java.util.Scanner;

public class Input {
    public static int scan() {

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static char readChar() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().charAt(0);
    }
}