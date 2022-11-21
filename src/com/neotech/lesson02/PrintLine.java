package com.neotech.lesson02;

public class PrintLine {
	public static void main(String[] args) {
		System.out.println("What's up Yilmaz");

		System.out.println("How are you doing?");
		//every statement in Java must end with a semicolon ;
		// println goes to next line and print keeps everything in the same line
		// println- prints and then moves to the new line

		System.out.print("1");
		System.out.print("2");
		System.out.print("3"); // after printing 3, it will stay at the same line

		System.out.println("4"); // after printing 4, it will move at the new line
		System.out.println("5");
		System.out.println("6");

		// print - print and does not move to the new line
		/*
		 * he printed 3 without moving to a new line, that is why 4 is printed in the
		 * same line. However, the code is println 4, which means, after printing 4, it
		 * will jump to a new line where 5 is printed
		 * 
		 */

		System.out.println("Do you like Java \nYes I do");
		System.out.println("Do you like Java \tYes I do");

		// the \ will make the rest of the sentence move to the next time
		// you can use print or println with \
		
		// \t means tab for the next time

		// Windows --> ctrl + shift + f will format your code ( make everything
		// start in a straigt line (makes the code look nicer 
		
	}
}
