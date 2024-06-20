package org.example;

import java.util.Scanner;

public class Input {
    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static char scanChar() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().charAt(0);
    }
}
