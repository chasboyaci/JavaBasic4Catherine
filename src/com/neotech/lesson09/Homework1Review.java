package com.neotech.lesson09;

public class Homework1Review {

	public static void main(String[] args) {
	/*
	 * 1. Write a program using while loop that calculates the sum of the even
	 * numbers between 0 and 10.
	 */
		
		//Create a logic that whatever the number I give you will print all 
		//next numbers until it gets to the max number assigned 
		
		
		//1st way: increment by 1 
		int num = 0; // it starts at 0 because the question ask for numbers 
		//between 0 and 10 and we start at the smallest 
		
		int sum = 0; //using sum to add all the numbers after "if" is ran
		
		
		while (num <=10) //this is always a boolean/ true or false
		{
			if (num % 2 == 0) //modulus to check even or odd. == to 0 means no remainder so it's even 
			{
				System.out.println(num);
				
				
				sum += num; // sum = sum + 1
			}
			
			
			num++; //we're using the num++ because we are asking for the # to increase
			// if we were asked for 10 to 0 it would be num--
			
		}
		
		System.out.println("the total sum of the even numbers are " + sum);
		//its outside of the { } to it only prints one. If it's inside it  will
		//print for every even number. 
		
		
		// a = 1
		// a = a + 5 
		//short hand operators: a +=5
		//increment a++ = 1 ( a + 1)
		
		

		
		//2nd way - INCREMENT BY 2 
		// 0, 2, 4, 6, 8, 10
		//if we start from an even number and keep adding 2, it will ways be an even number
		int num2 = 0;
		
		int total = 0;
		
		while (num2 <= 10) //must add = to < to include the number 10
		{
			total += num2; //Add num2 to total
			
			num2 += 2; // 0 + 2 = 2 | 2 + 2 = 4 | 4 + 2 = 6 | 
			// that is what this is doing to only look at even numbers
		}
		
		System.out.println("The total is: " + total);
		
		
		
		
		
		
		

	}

}
