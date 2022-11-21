package com.neotech.lesson12;

public class Task02Lesson11Review {

	public static void main(String[] args) {
		
		//Homework 2:
		// Create an array on integers and calculate the sum of all elements in an array.	
		
		int[] numbers = {5, 11, 9, 7};
		
		//using for-each
		
		//find the total of the numbers
		int total = 0; 
		
		//for every number inside the numbers
		for(int number : numbers)
		{
			total += number;
		}
		System.out.println("The total is " + total);
		
		
		System.out.println("The amount of individual numbers in the array is: " + numbers.length);

	}

}
