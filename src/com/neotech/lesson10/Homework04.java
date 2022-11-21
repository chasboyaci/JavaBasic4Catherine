package com.neotech.lesson10;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
//Create a program that will be asking user to apply for a credit 
//card 10 times. As soon you get a "yes" from a user program
//should stop asking.

//think about the best solution 
// it will be for loop
//ask a max of 10 times. if we get a yes before it gets to the max
// break the loop

		Scanner scan = new Scanner(System.in);

		String input;

//ask user 10 times
//not using <= because the compiler will print 11 times because 10 is included

		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want to apply for a credit card");
			input = scan.next();

			if (input.equals("yes")) // no ; in the if statement
			{
				System.out.println("perfect, good choice!");
				break; // it will stop once we get a yes
			}

		}

	}

}
