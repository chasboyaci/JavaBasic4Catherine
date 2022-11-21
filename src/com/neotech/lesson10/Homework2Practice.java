package com.neotech.lesson10;

public class Homework2Practice {

	public static void main(String[] args) {
		/*
		 * Homework 2: Ask the user to enter an integer and build the following pattern:
		 * 1 
		 * 1 2
		 * 1 2 3 
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 1 2 3 4 
		 * 1 2 3
		 * 1 2 
		 * 1
		 */
		
		
		for (int row = 1; row <= 5; row++)
		{
			for(int col = 1; col <= row; col++ )
			{
				System.out.print(col);
			}
			System.out.println();
		}
		for (int row2 = 4; row2 >= 1; row2--)
		{
			for(int col2 = 1; col2 <= row2; col2++)
			{
				System.out.print(col2);
			}
			System.out.println();
		}
		
		
		

	}

}
