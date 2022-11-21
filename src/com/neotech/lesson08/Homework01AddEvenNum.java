package com.neotech.lesson08;

public class Homework01AddEvenNum {

	public static void main(String[] args) {
		
	//1. Write a program using while loop that calculates the sum of the even
	//numbers between 0 and 10.	
		
		int num = 0;
		int sum = 0;
		
		while (num <= 10)
		{
			
			if (num % 2 == 0)
			{
				sum = sum + num;
				System.out.println(num + " ");
			}
			
		++num;
			
	
		}
		
		System.out.println("Even numbers sum: " + sum);
		
		
		
		

	}

}
