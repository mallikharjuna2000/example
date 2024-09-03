package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double accountBalance = 10000.0;
		System.out.println("Enter amount to withdraw : ");
		double withdrawAmount = scanner.nextDouble();

		if (withdrawAmount <= accountBalance) {
			double remainingBalance = accountBalance - withdrawAmount;
			System.out
					.println(withdrawAmount + "is withdrawn successfully... remaining balance is " + remainingBalance);
		} else {
			System.out.println("Insufficient funds in your account.... please check your account Balance..");
		}

	}

}
