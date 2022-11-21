package com.neotech.lesson06;

public class Homework03 {

	public static void main(String[] args) {
		
		//Interview Question: 
				//Write a Java Program to check whether number is Even or Odd	
		
		// set variable number
		int number = 2373;
		
		// first method
		int remainder = number % 2;
		
		//check if the remainder is 0 
		
		if(remainder ==0)
			//if the remainder is 0 the number is even
		{
			System.out.println("This is an even number!");
		}
		else 
			// if there's a remainder it's an odd number and will print the 
			// else statement 
		{
			System.out.println("This is an odd number!");
		}
			
		
		//second method to see if it's an odd or even number 
		
		if(remainder ==1)
			//if the remainder is 0 the number is odd
		{
			System.out.println("This is an odd number!");
		}
		else 
			// if there's isn't a remainder it's an even number and will print  
			// the else statement 
		{
			System.out.println("This is an even number!");
		}
		
		//third method to see if it's an odd or even number 
		
		if (number % 2 == 1)
		{
			System.out.println("This is an odd number!");
		}
		else 
		{
			System.out.println("This is an even number!");
		}
		

	}

}
