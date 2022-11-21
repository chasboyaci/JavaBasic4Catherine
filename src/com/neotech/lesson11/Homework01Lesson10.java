package com.neotech.lesson11;

import java.util.Scanner;

public class Homework01Lesson10 {

	public static void main(String[] args) {
		
		/*
		 * Homework 1:
		 * 
		 * Ask the user to enter an integer and build the following pattern: Hint: Use
		 * scanner, if user entered number 5, there should be 5 rows. In the first row,
		 * 0 spaces, (2 * 5) - 1 stars In the second row, 1 spaces, (2 * 4) - 1 stars In
		 * the third row, 2 spaces, (2 * 3) - 1 stars In the fourth row, 3 spaces, (2 *
		 * 2) - 1 stars In the fifth row, 4 spaces, (2 * 1) - 1 stars
		 *********
		  *******
		   *****
		    ***
		     * 
		 **/
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number?");
	int num = input.nextInt();
	
	//Nested Loops are used when we have rows and columns 
	
	for(int row = 1; row <=num; row++) //I want to have as many rows as the number user entered that is why we use num
	{
		//when row = 1, there is zero space
		//when row = 2, there are 2 spaces
		for(int spac = 1; spac <= row; spac++)
		{
			System.out.print(" ");
		}
		
		//when row =1 we have 2 * 5 - 1
		//when row = 2 we have 2* 5 = 1
		for(int star = 1; star <= 2 * (num - row) - 1; star++)
		{
			System.out.print("*");
		}

		
		
		System.out.println();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
