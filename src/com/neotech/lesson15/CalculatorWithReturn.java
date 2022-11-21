package com.neotech.lesson15;

public class CalculatorWithReturn {

	//This is with no return
		//void add (int a, int b)
		//{
			//int sum = a + b;
			//System.out.println(sum);
		//}
	
	
	//lets add two numbers
	
	int add(int a, int b)
	{
		int sum = a + b;
		
		//add the numbers and send the sum back (don't print)
		return sum;
	}
	
	//we are writing a multiply method, which 
	// takes two numbers as parameters 
	//then returns their product 
	
	int multiply (int a, int b)
	{
		//send back their product
		return a * b;
	}
	
	double divide(double a, double b)
	{
		double div = a/b; //or return a/b
		
		return div;
		
	}
	//simplest method, no input, just return 5
	//any time that it is called:
	int giveBackSomething()
	{
		return 5;
	}
	
	
	void dontGiveBackAnything()
	{
		System.out.println("Nothing is sent back");
	}
	
	
	//create a method that gets three integers as inputs
	//and send back the average 
	
	double average(double a, double b, double c)
	{
		return (a + b + c)/3;
	}
	
	
	
	
	
	
	
	
	
	
}
