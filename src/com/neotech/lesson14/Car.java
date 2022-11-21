package com.neotech.lesson14;

public class Car {

//The class is the blueprint and does not need main methods because we usually don't
	//run in the class because it's a blueprint. 
//What features does a car have?
//Make, model, color, year, mileage, maxSpeed : features
//What behaviors does the car have? What can the car do? 
	//Drive() Stop () TransportPeople()

//How can we create features: These are the properties 
String make; 
String model;
String color;
int year;
int mileage;
int maxSpeed; 
	

//How do we create our behaviors:
//return type method name()
//{
//  your code goes in here
//}

void drive()
{
	System.out.println(make + " " + model + " drives!");
}
void stop ()
{
	System.out.println(make + " stops!");
}

void transport ()
{
	System.out.println(make + " can transport people!");
}

public static void main(String[] args) {
	//How do we create an object from our blueprint/template
	
	
	
	//The object is Car
	Car car1 = new Car(); // this is initiating 
	//what does car1 do? 
	
	//1. declaring an object of class Car
	//2. instantiation (new)
	//3. Car() ---initialization 
	
	//car1 is the object
	//set the properties of the object: 

	car1.make = "Toyota";
	car1.model = "Camry";
	car1.color = "Red";
	car1.year = 2019;
	car1.mileage = 25000;
	car1.maxSpeed = 220;
	
	System.out.println(car1.make + " " + car1.model + " " + car1.year);
	
	
	//behaviors/functions
	//This is pulling from the voids created at the top
	car1.drive();
	car1.stop();
	car1.transport();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



	
	
}
