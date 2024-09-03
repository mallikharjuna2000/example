package com.codegnan.controlstatements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println("Factorial of a number " + number + " is " + result);
	}

}
