package com.codegnan.controlstatements;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the Number of Terms in the Fibonacci Series : ");
		int numberOfTerms = scanner.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibanocci Series : ");
		System.out.print(firstTerm + " " + secondTerm + " ");
		for (int i = 2; i < numberOfTerms; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(" "+nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
