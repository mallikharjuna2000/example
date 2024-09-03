package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temparture in celsius : ");
		int temprature = scanner.nextInt();
		if (temprature > 30) {
			System.out.println("Wether is too hot.. please wear the cotton clothes..");

		} else {
			// their is no specific logic.
		}
		if (temprature > 20 && temprature < 30) {
			System.out.println("Wether is normal.. enjoy your day..");

		} else {
			// their is no specific logic.
		}
		if (temprature > 10 & temprature < 20) {
			System.out.println("Wether is too cold.. please wear the swaters..");

		} else {
			// their is no specific logic.
		}
	}

}
