package com.neotech.lesson08;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
	
		//Write a program that asks user to enter his/her username 
		//and password until user enters them correctly.

		Scanner input = new Scanner(System.in);
		
		boolean correct = true;
		
		while (correct)
		{
			System.out.println("Please enter your username");
			String userName = input.next();
			
			System.out.println("Please enter your password");
			String passWord = input.next();
			
			if (userName.equals("oceanside") && passWord.equals("Allee"))
				
					{
				System.out.println("Login is successful!");
					}
			
			else
			{
				System.out.println("Login incorrect");
			}
			
		}
		
	
		
		
	}

}
