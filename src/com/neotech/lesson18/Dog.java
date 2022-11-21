package com.neotech.lesson18;

public class Dog {
	
	
	//Instance/Object variable
	String name;
	int age;
	
	
	//Static Variable
	//static variable doesn't change 
	static String breed = "Husky";
	static int paws = 4;
	
	void displayDogInfo()
	{
		System.out.println("Name : " + name + " age: " + age + " breed: " + breed + " paws: " + paws);
	}

}
