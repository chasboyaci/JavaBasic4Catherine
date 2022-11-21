package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {

		/*
		  
		  *
		  **
		  ***
		  ****
		  *****
		 
		 */

		for (int row = 1; row <= 5; row++) {
			// this inner loop executes as many times as the value
			// of the row
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
