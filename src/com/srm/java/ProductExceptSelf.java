package com.srm.java;
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] answer = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            answer[i] = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    answer[i] = answer[i] * nums[j];
                }
            }
        }

        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }
}