package com.codegnan.controlstatements;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr a number to reverse : ");
		int number = scanner.nextInt();
		int reversedNumber = 0;
		int originalNumber = number;
		while (originalNumber != 0) {
			int remainder = originalNumber % 10;
			reversedNumber = (int) (reversedNumber + Math.pow(remainder, 4));
			originalNumber = originalNumber / 10;

		}
		// System.out.println("The reverse of a number " + number + " is " +
		// reversedNumber);
		if (number == reversedNumber) {
			System.out.println(number + " is Armstrong");
		} else {
			System.out.println(number + " is Not A Armstrong ");
		}
	}
}
