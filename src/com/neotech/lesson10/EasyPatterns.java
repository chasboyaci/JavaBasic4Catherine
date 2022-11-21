package com.neotech.lesson10;

public class EasyPatterns {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *

//lets use nested loops 

		for (int row = 5; row > 0; row--) { // outer loop
			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}