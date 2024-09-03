package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		if(number>0) {
			System.out.println("the Given Number "+number+" is psoitive");
		}else {
			// here therir is no specific logic for else block.
		}

	}

}
