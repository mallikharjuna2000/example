package com.codegnan.controlstatements;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Day of Week...");
		int dayName = scanner.nextInt();
		switch (dayName) {
		default:
			System.out.println("please provide day name between 1-7 numbers :");

		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Monday");

		case 3:
			System.out.println("Tuesday");

		case 4:
			System.out.println("Wedneday");
			break;
		case 5:
			System.out.println("thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		}

	}

}
