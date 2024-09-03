package com.codegnan.patternexamples;

public class TrianglePatterns {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				// System.out.print("* ");
				// System.out.print(j+" ");
				// System.out.print(9-j+" ");
				// System.out.print(i+" ");
				// System.out.print(9-i+" ");
				//System.out.print((char) (97 + j) + " ");
				//System.out.print((char) (106- j) + " ");
				//System.out.print((char) (97 + i) + " ");
				System.out.print((char) (106-i) + " ");
			}
			System.out.println();
		}
	}

}
