package com.srm.java;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int origNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        if (sum == origNumber) {
            System.out.println("The given number " + origNumber + " is an Armstrong number");
        } else {
            System.out.println("The given number " + origNumber + " is not an Armstrong number");
        }
        input.close();
    }
}