package com.neotech.lesson06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
//2. Write a program that calculates the sum of two numbers entered by the user.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		System.out.println("Enter a second number");
		int number2 = input.nextInt();
		
		
		int total = (number + number2);	
		System.out.println("The sum of the two numbers equals to " + total);
				
				
				
				
				
				
	}

}
