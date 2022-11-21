package com.neotech.lesson22;

public class Car {
	//Homework 2:
	   // Write a Java program called Car. Specify features and behaviours of the Car class.
	   // Create SportsCar and FamilyCar subclasses of the Car class with their own features and behaviours.
	   // Next, create a LuxurySportsCar that will inherit the SportsCar and also will have its own features and behaviours.
	   // Create objects from each class and test them.
	
	//Car class constructor:
	//their name is the same as the class
	//they have no return type
	
	
	String make, model;
	
	Car()
	{
		System.out.println("Car Default Constructor");
	}
	
	Car(String make, String model)
	{
		this.make = make;
		this.model = model;
		
	}
	
	void driving()
	{
		System.out.println("car is driving");
	}
	
}


