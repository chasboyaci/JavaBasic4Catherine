package com.neotech.lesson21;

public class Dog extends Animal { //inherit from the Animal Class
	
	
//dog specific properties
	String breed;
	
	//dog specific behaviors
	public void bark() 
	{
		System.out.println("Only dogs bark!");
		System.out.println("The breed is " + breed);
	}
	
	
	
}
