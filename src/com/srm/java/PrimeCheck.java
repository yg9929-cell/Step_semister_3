package com.srm.java;
import java.util.Scanner;
public class PrimeCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int number = input.nextInt();
		boolean isPrime = true;
		if(number < 2) {
			isPrime = false;
		}
		else {
			for (int i = 2; i < number; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println("the given number "+number+" is " +isPrime);
		input.close();
	}
}
