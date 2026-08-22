package com.srm.java;
import java.util.Scanner;
public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int originalnumber = number;
		int reversednumber = 0;
		while (number > 0) {
			int digit = number % 10;
			reversednumber = reversednumber * 10 + digit;
			number = number /10;
		}
		if (reversednumber == originalnumber) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not a palindrome");
		}
		sc.close();
	}

}
