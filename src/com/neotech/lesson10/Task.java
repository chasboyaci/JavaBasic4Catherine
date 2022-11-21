package com.neotech.lesson10;

public class Task {

	public static void main(String[] args) {
//		print this structure using a nested for loop.
//
//		1
//		22
//		333
//		4444
//		55555

		// iterate through i 5 times
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			// print a new line, go to the outer loop
			System.out.println();
		}

	}

}
