package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		int sum = 0;
		int originalNumber = number;
		while (number != 0) {
			int digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("the sum of digits in a given number is "+originalNumber+" is "+sum);
	}

}
