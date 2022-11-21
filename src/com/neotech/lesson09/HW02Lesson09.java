package com.neotech.lesson09;

import java.util.Scanner;

public class HW02Lesson09 {

	public static void main(String[] args) {
	/*
	* 2. Create a program that will be asking user to apply for a credit card 10
	* times. As soon you get an "yes" from a user program should stop asking.
	*/
		Scanner input = new Scanner(System.in);
		
		String ask;
		
		for (int times = 0; times < 10; times++) 
		{
			System.out.println("Interested in applying for a credit card? Yes/No");
			ask = input.next();
			
			if (ask.equals("yes"))
			{
				System.out.println("We will process your application");
				break;
			}
					
					
					
					
					
					
		}
		
	
		
		
		
		
		
		
		
		
	}

}
