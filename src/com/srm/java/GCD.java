package com.srm.java;
import java.util.Scanner;
public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		while(number2!= 0) {
			int remainder = number1 % number2;
			number1 = number2;
			number2 = remainder;
		}
		System.out.println("the greatest number is " + number1);
		sc.close();
	}

}
