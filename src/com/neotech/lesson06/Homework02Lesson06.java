package com.neotech.lesson06;

import java.util.Scanner;

public class Homework02Lesson06 {

	public static void main(String[] args) {
		//2. Write a program that will ask for the day (a number from 1-7). 
		//Print whether it is a weekend or weekday.
		//If any day from 1-5 → output “It is a weekday”
		//Any day from 6-7 → output “It is a weekend”,
		//Any other day → output “Invalid day”

		
		Scanner input = new Scanner(System.in);
	
		System.out.println("What day is it");
		int day = input.nextInt();
		
		
		if (day >= 1 && day <= 5)
		{
			System.out.println("It is a weekday");
		}
		else if (day >=6 && day <= 7)		
		{
			System.out.println("It is a weekend");
		}
		
		else
		{
			System.out.println("Invalid day");
		}
		
		

	}

}
