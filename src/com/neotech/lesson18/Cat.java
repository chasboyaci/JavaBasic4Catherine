package com.neotech.lesson18;

public class Cat { //BLUEPRINT
	
	//INSTANCE VARIABLES
	String name;
	int weight;
	String color;
	
	//Methods/behaviors/functions 
	
	void sayMeow()
	{
		//this is a local variable
		String word = "meow";
		System.out.println(word);
	}

	void displayCatInfo()
	{
		System.out.println("Name: " + name + " weight: " + weight + " color: " + color);
	}
	
	
}
