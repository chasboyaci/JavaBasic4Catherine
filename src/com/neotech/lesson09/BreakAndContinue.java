package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {
			// when a becomes 5, break statement will execute
			// and get out of the loop
			if (a == 5) {
				break;
// it's not printing the numbers once a == 5 because 
// of the break! The break ends the loop
			}

			System.out.print(a);
		}

		System.out.println();
		// using for loop -- I want to give the user max 5 tries

		for (int a = 1; a <= 10; a++) {
			if (a == 5) {
				continue; //
			}
			System.out.print(a);
// the continue; makes the compiler skip 5 from 1-10
		}

	}

}

//break is to end the loop according to the if statement 
// continue is make the compiler skip the if statement 