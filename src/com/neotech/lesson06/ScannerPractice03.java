package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerPractice03 {

	public static void main(String[] args) {
//3. Create a Java program that will ask user to input city and temperature.
//Your program should convert Fahrenheit into celsius and print 
//“The temperature is the city __ is __”
		
		
		Scanner input = new Scanner(System.in);

		//used string instead of input because I am asking to enter a word not 
		//number. Int is for numbers
		System.out.println("What city do you live in");
		String city = input.next();
		
		//used int because it's a number 
		System.out.println("What is the temperature in fahrenheit");
		int temp = input.nextInt();
		
		
		double celsius = ((double)temp - 32)*.5556;
		System.out.println("The temperature in " + city + " is " + celsius + " celsius");
		
		
		

	}

}
