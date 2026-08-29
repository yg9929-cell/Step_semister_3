package com.srm.java;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("true");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("false");

        sc.close();
    }
}
