package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElseIfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your city name : ");
		String cityName = scanner.next();

		if (cityName.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi.. Adaab...");
		} else if (cityName.equalsIgnoreCase("Chennai")) {
			System.out.println("Hello Madrasi Vanakkam...");

		} else if (cityName.equalsIgnoreCase("Banglore")) {
			System.out.println("Hello Kannadiga.. Namaskara..");
		} else {
			System.out.println("Please Enter the Valid City Name..");
		}

	}

}
