package com.neotech.lesson0205;

public class HomeworkJava04 {

	public static void main(String[] args) {
		//1. Create a Java program and name it Double Comparison.
		//Declare 2 double values and if value of first variable is higher 
		//then the second,
		//print �Double value __ is larger than __ .�
		//Otherwise print...	

		
		double a = 70.5050;
		double b = 80.5050;
		
		if (a > b)
			System.out.println("Double value " + a + " is larger than " + b);
		else 
			System.out.println("Double value " + b + " is larger than " + a);
		
		
		//2. Create a Java program and name it Temperature Check.
		//Create variable to store temperature.
		//Your program should check if temperature is below 32
		//If temperature is below
		// then it should print �Water will freeze with temperature __�,
		//otherwise �Water will NOT freeze with temperature __�.	
		
		int temperature = 80;
		
		if(temperature < 32)
		{
			System.out.println("Water will freeze with temperature " + temperature);
		}
		else
		{
			System.out.println("Water will NOT freeze with temperature " + temperature);
		}
		
		
	}

}
