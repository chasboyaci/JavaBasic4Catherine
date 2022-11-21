package com.neotech.lesson10;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// formatting shortcut: ctrl + shift + f
		// this makes everything aligned nicely

		// ctrl + s is the shortcut to save & importing Scanner too :)

//HW :Write a program that ask user to enter his/her username and password
// until user enters them correctly		

//how do we decide on what to do?
//which loop to use, for or while or do while
//for is more suitable when you have a countable number of loops.		
//Here DO WHILE seems more suitable 

//When you compare primitive data types, you can use ==
//When you compare String data types, you should use .equals()

		Scanner scan = new Scanner(System.in);

		String userName = "username";
		String password = "password";

		String userNameInput;
		String passwordInput;

		do {
			System.out.println("Enter username and password: ");
			userNameInput = scan.next();
			passwordInput = scan.next();

			if (userNameInput.equals(userName) && passwordInput.equals(password)) {
				System.out.println("You are now logged in!"); //
				break;
			} else {
				System.out.println("Wrong username or password");
			}

		} while (userNameInput != userName || passwordInput != password);

	}

}
