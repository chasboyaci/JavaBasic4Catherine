package com.neotech.lesson10;

public class Homework03 {

	public static void main(String[] args) {

//Print numbers from 1 to 50 except those that are divisible by 3

// 1st method: WHILE LOOP

		int i = 1; // i is used for this in programming

		while (i <= 50) {
			if (i % 3 == 0) {
				i++; // adding this to add 1 to the next number for the compiler to check
				// if it's divisible or not to 33 to see if it should skip/continue or print
				continue; // aka skip
			} else {
				System.out.print(i + " ");
			}

			i++;
		}

		
		System.out.println();

// 2nd method - DO WHILE	

		int j = 1;

		do {
			if (j % 3 == 0) {
				j++;
				continue; // using this so it skips the # that are divisible by 3
			}
			System.out.print(j + " ");
			j++;
		} while (j <= 50);

		System.out.println();

//3rd method - FOR LOOP 

		for (int k = 1; k <= 50; k++) {
			if (k % 3 == 0) {
				continue; // it's telling the compiler to stop if it's divisible by 3
				// and to go back to top of the code to run the next number
				// it will ignore the numbers that are divisible by 2
			}
			System.out.print(k + " ");
		}

	}

}
