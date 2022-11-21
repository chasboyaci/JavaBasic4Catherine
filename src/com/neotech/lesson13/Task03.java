package com.neotech.lesson13;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */

		int[] [] N = {
				{3,4,5},
				{10,11,12},
				{7,8,9}
		};
		
		//USING THE INDEXED FOR LOOP
		
		int sum = 0; //need to create a variable/bucket to store to sum
		
		for(int row = 0; row < N.length; row++)
		{
			for(int col = 0; col < N[row].length; col++)
			{
				sum +=N[row][col]; //this is using short hand 
				//sum = sum + N[row][col]; // this is using the long way
			}
		}
		System.out.println("The total sum is: " + sum);
		
		
		//USING ENHANCED LOOP 
		
		int sum2 = 0;
		
		for(int[] row : N)
		{
			for(int element : row) //the numbers in the rows is the element
			{
				sum2 += element;
			}
		}System.out.println("The total sum is: " + sum2);
		
		
		
		
		
		
	}

}
