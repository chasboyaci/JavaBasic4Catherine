package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
	//Ask a user: Guess the number
	//Lucky number is 5
	//As long as the entered number is not 5 we need to keep asking to try again
	//Once number is correct it should print "You're a winner"
		
		int luckyNumber = 5;
		
		Scanner scan = new Scanner(System.in);
		
		int number; 
		
		//this EXAMPLE OF USING WHILE LOOP
		//System.out.println("Guess my number ");
		//number = scan.nextInt();
		
		/*
		 * while(number !=luckyNumber) { //keep asking again
		 * System.out.println("Guess my number: "); number = scan.nextInt(); }
		 * 
		 * System.out.println("Your number " + number);
		 */
		// Do While 
		
		do
		{
			System.out.println("Guess my number: ");
			number = scan.nextInt();
			
		}
		while (number != luckyNumber); //Once this is false and it actually equals to 5 it will print number
			{// while it's true we want it to keep asking the user to guess the number. 
				
			System.out.println("You're a winner");
			}
		
		//do while is perfect because we want to have the user guess the number first before
			// the system checks the code
		

	} // DO WHILE AND WHILE ARE GOOD WHEN YOU DON'T KNOW HOW MANY TIMES TO LOOP

}

