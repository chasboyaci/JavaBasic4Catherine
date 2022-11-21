package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// import scanner class
		// windows -> ctrl + shift + o

		// Declare a Scanner variable. In this case we named it "input" below
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");

		// declare a variable to catch the user input
		String name = input.next();
		// Write name on the screen
		System.out.println("Nice to meet you: " + name);

		// declare an integer to catch the users name
		System.out.println("Please enter your age:");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);

		// declare an double to catch the users weight. Using double in case the
		// weight includes decimal like 110.5
		System.out.println("Please enter your weight:");
		double weight = input.nextDouble();
		System.out.println("Your weight is: " + weight);

		// declare a boolean for a true or false. Can't be yes or no in the
		// in the console
		System.out.println("Do you think it's going to rain today");
		boolean willRain = input.nextBoolean();
		System.out.println("You think it's going to rain " + willRain);

		if(willRain)
		{
			System.out.println("Bring your umbrella with you!");
		}
		else
		{
			System.out.println("Enjoy the weather!");
		}
		
		
		
	}

}
