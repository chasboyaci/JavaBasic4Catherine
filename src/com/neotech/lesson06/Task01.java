package com.neotech.lesson06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
//1. Write a program that asks user to enter first name and then last name.
//At the end system should display user’s full name.


		// Task 01
		//Ask user for first name
		//Scanner is to use when you ask for an input from the user 
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.next();
		
		//Ask user for last name 
		System.out.println("What is your last name?");
		String lastName = input.next();
		
		//Print full name on the screen
		System.out.println("Full name: " + firstName + " " + lastName);
		
	}

}
