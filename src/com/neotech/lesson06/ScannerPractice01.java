package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerPractice01 {

	public static void main(String[] args) {
		
//Use Scanner

//1. You are a loan specialist and you need to ask the user what is the 
//amount of loan that is needed.
//If loan is less or equal to 200,000 then you would lend the money 
//otherwise you would reject the client.
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much do you need to borrow");
		int amount = input.nextInt();
		
		if (amount <= 200000)
		{
			System.out.println("Loan is approved");
		}
		else
		{
			System.out.println("Loan is denied");
		}
	}

}
