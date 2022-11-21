package com.neotech.lesson06;

public class LogicalAnd {

	public static void main(String[] args) {
		//Declare a number
		//if the number is between 1-10 -> number is small
		//if the number is between 11-100 -> number is medium
		//if the number is between 101-1000 -> number is large
		
		
		//declare a number/variable
		int number = 0;
		
		//check if the number is between 1 and 10
		if (number >= 1 && number <= 10)
			
		{
			System.out.println("It's small number");
		}
		//check if the number is between 11 and 100
		else if (number >= 11 && number <= 100)
			
		{
			System.out.println("It's medium number");
		}
		//check if the number is between 101 and 1000
		else if (number >= 101 && number <= 1000)
			
		{
			System.out.println("It's large number");
		}
		
		else //must end with an else/catcher statement 
			//check if the number is larger than 1000
		{
			System.out.println(number + " is out of range");
		}
	} 

}
