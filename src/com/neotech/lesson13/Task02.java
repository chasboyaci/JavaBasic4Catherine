package com.neotech.lesson13;

public class Task02 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */
		
int[][] numbers = {
		{2,4,6,8},
		{1,3,5,7},
		{10,12,14,16}	
};

	for(int row = 0; row < numbers.length; row++)
		
		for(int col = 0; col <numbers[row].length; col++)
		{
			if(numbers [row][col] % 2 == 0)
			{
				System.out.print(numbers[row][col] + " ");
			} 
		
		
		}System.out.println();
			
	for (int[] row : numbers)
	{
		for (int number : row)
		{
			if (number % 2 == 0)
			{
				System.out.print(number + " ");
			}
		}
	}System.out.println();
	
		
	
	
	
	
	
	
		
	}

}
