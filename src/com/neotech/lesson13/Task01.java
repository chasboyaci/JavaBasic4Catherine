package com.neotech.lesson13;

public class Task01 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integer type with 3 rows and 4 columns and print all
		 * values of the whole array.
		 */

		int[][] numbers = {
				{10, 34, 59, 65},
				{45, 64, 84, 36},
				{20, 17, 85, 54}		
		};
		
		for (int row = 0; row < numbers.length; row++)
		{
			for(int col = 0; col <numbers[row].length; col++)
					{
				System.out.print(numbers[row][col] + " ");
					}System.out.println();
		}
		
		
		
		
		
		
		
	}

}
