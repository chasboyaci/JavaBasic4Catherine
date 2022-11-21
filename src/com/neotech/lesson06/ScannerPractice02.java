package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerPractice02 {
//2. You are DMV representative and you need to ask customer their age.
//If they are 18 and older you will issue a driver licence to them, 
//otherwise you will offer them to get a learners permit.

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How old are you");
		int age = input.nextInt();
		
		if (age >= 18)
		{
			System.out.println("I will issue you a driver license");
		}
		
		else
			System.out.println("I will issue you a learners permit");
		
		
		
	}

}
