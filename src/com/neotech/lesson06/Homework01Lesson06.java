package com.neotech.lesson06;

import java.util.Scanner;

public class Homework01Lesson06 {

	public static void main(String[] args) {

//1. Ask the user to enter the height in inches. Person should be classified 
//as one of the following:
	//• short (under 60 inch)
	//• medium (between 60 -72 inch)
	//• tall (over 72 inch)

		//This is used to answer the questions in the consule
		Scanner input = new Scanner(System.in);
		
		//Start the process with the question and indicating what variable you
		//will be using. In this case it's int
		System.out.println("What is your height in inches");
		int height = input.nextInt();
	
		// if height it less than or equal to 60
		if (height < 60) {
		
			System.out.println("You are short");
		}
		
		//if height is greater than or = to 60 and less than or = to 72
		else if (height >= 60 && height <= 72 ) {
		
			System.out.println("You are medium height");
		}
		// if it's great then 72
		//Always need an else statement at the end to capture the remainder of 
		// what is outside of the if statements 
		
		
		//else //can't use this because -# will execute "You are tall
		
			//System.out.println("You are tall");
		
		//must add else if for taller than 72
		else  if (height >= 72)
		{
			System.out.println("Classified as tall");
		
		}
		
		else
		{
			System.out.println("Invalid");
		
		}

		
			
	}

}
