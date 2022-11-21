package com.neotech.lesson11;

import java.util.Scanner;

public class Homework02Lesson10 {

	public static void main(String[] args) {
		/*
		 * Homework 2:
		 * 
		 * Ask the user to enter an integer and build the following pattern: Hint: Use
		 * scanner, if user entered number 5, there should be two parts The first part,
		 * 1 to 5 The second part, 4 to 1
		 * 
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
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		for(int row = 1; row <= num; row++)
		{
			for(int col = 1; col <= row; col++ )
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
		//Print the bottom patter
		//1 2 3 4 
		//1 2 3
		//1 2
		//1
		
		for(int row = num - 1; row >= 1; row--)
		{
			
			for (int col = 1; col <= row; col++)
			{
				System.out.print(col);
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		

	}

}
