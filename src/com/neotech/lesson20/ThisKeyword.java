package com.neotech.lesson20;

public class ThisKeyword {
	
	int a, b;
	String name;
	
	//create a constructor
	ThisKeyword()
	{
		
	}
	
	//parameterized constructor
	ThisKeyword(int a, int b)
	{
		//we want to assign values we got from the users to the instance variables
		//this.a --> refers to the instance variable a (light blue a)
		//a --> is the local variable that came from the user
		this.a = a; //this.a is an instance variable and a is a local variable
		this.b = b;
		
	}
	
	
	//method
	void sum(int a, int b)
	{
		System.out.println("Sum of local variables is " + (a + b));
		System.out.println("Sum of instance variables is " + (this.a + this.b));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
