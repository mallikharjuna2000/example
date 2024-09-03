package com.codegnan.controlstatements;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		for (int i = 1; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}
}
