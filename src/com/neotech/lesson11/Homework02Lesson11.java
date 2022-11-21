package com.neotech.lesson11;

public class Homework02Lesson11 {

	public static void main(String[] args) {
		
//Homework 2:
// Create an array on integers and calculate the sum of all elements in an array.	
		
	int[] nums = { 10, 20, 30, 40, 50, 60};
	
	int size = nums.length;
	
	for(int i = 0; i < size; i++)
	{
		System.out.print(nums[i] + " ");
	}
	
	System.out.println();
	
	int sum = 0; 
	
	for(int i = 0; i < nums.length; i++)
	{
		sum += nums[i];
	}
		System.out.println("The total is " + sum);
		
		
		
		

	}

}
