package com.srm.java;

import java.util.Scanner;

public class PrintNumbers {

    void printNumbersUpToN(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        PrintNumbers obj = new PrintNumbers();
        obj.printNumbersUpToN(n);

        sc.close();
    }
}