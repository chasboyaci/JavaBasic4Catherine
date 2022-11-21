package com.neotech.lesson13;

public class IntForEachExample {

	public static void main(String[] args) {
		
		int[][] grades = {
				{95, 78, 85},
				{100, 68, 89, 90},
				{75, 78},
				{55, 89, 76, 80, 50}		
		};
		
		

		for(int[] row : grades) //the row
		{
			for(int grade : row) // for each row we want to get the integers
			{
				System.out.print(grade + " ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
