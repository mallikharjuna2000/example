package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 1000; // Initial balance
		int pin = 1234; // Example PIN
		int enteredPin;

		// Ask for PIN
		System.out.print("Enter your PIN: ");
		enteredPin = scanner.nextInt();

		// Validate PIN
		if (enteredPin != pin) {
			System.out.println("Incorrect PIN. Exiting...");
			return;
		}

		int choice;
		do {
			// Display menu
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			// Process the choice using switch case
			switch (choice) {
			case 1:
				System.out.println("Your balance is: $" + balance);
				break;
			case 2:
				System.out.print("Enter amount to deposit: ");
				int deposit = scanner.nextInt();
				if (deposit % 100 != 0) {
					System.out.println("Deposit amount must be a multiple of 100.");
				} else if (deposit < 500) {
					System.out.println("Deposit amount must be at least 500 rupees.");
				} else {
					balance += deposit;
					System.out.println("Deposited $" + deposit + ". New balance is: $" + balance);
				}
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				int withdraw = scanner.nextInt();
				if (withdraw % 100 != 0) {
					System.out.println("Withdrawal amount must be a multiple of 100.");
				} else if (withdraw < 500) {
					System.out.println("Withdrawal amount must be at least 500 rupees.");
				} else if (withdraw > balance) {
					System.out.println("Insufficient funds.");
				} else {
					balance -= withdraw;
					System.out.println("Withdrew $" + withdraw + ". New balance is: $" + balance);
				}
				break;
			case 4:
				System.out.println("Exiting... Thank you for using the ATM.");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option.");
				break;
			}
		} while (choice != 4);

		scanner.close();
	}
}
