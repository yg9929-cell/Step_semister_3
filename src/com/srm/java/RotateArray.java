package com.srm.java;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }

        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i] + " ");
        }
        sc.close();
    }
}