package com.neotech.lesson10;

import java.util.Scanner;

public class Homework02Lesson10 {

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
		
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter a number");
		
		//int input = scan.nextInt();
		
		

		for (int row = 1; row <= 5; row++)
		{
			for (int col = 1; col <= row; col++)
			{
				System.out.print(col);
			}

			System.out.println();
			
		}
		for(int row1 = 4; row1 >= 1; row1--)	
		{
			for(int col1 = 1; col1 <= row1; col1++)
			{
				System.out.print(col1);
			}
			System.out.println();
		}
			
		
		
		
		
	}

}
