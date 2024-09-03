package com.codegnan.patternexamples;

public class Pattern_01 {
	public static void main(String[] args) {

		// outer for loop talks about the rows
		for (int i = 0; i < 10; i++) {
			// inner for loop for columns to print star
			// for (int j = 9; j >= 0; j--) {
			for (int j = 0; j < 10; j++) {
				// System.out.print("* ");
				// System.out.print(j+" ");
				// System.out.print(9-j+" ");

				// System.out.print(i+" ");
				// System.out.print(9-i+" ");
				// System.out.print((char)(97+j));
				// System.out.print((char) (106-j));
				// System.out.print((char) (97 + i));
				System.out.print((char) (106 - i));
			}
			System.out.println();
		}
	}
}
