package com.neotech.lesson25;

//Homework: 
   // ▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
   // ▪ Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
   // ▪ Define some methods specific to the child classes.
   // ▪ Create objects of the child classes and store them in an array.
   // ▪ Loop through each object and execute available methods.



public class Computer {

	String brand;
	
	//by not using the default constructor we force the users to 
	//enter the brand when they create an object
	public Computer(String brand) {
		this.brand = brand;
	}
	
	//method in the Computer class
	//all the child classes have this method now 
	public void run() {
		System.out.println(brand + " computer can run the system!");
	}
	
	
	
	
}

//this is a method because it has void
//public void Computer(String brand) {
	//this.brand = brand;
//}

//}



class Apple extends Computer{

	public Apple(String brand) {
		super(brand);
		
	}
	
	//override the run() method 
	//signature must be the same
	// the green triangle means overriding 
	public void run() {
		System.out.println(brand + " computer runs faster");
	}
	public void safe() {
		System.out.println(brand + " computers are safe");
	}
	
}

class Lenovo extends Computer{

	public Lenovo(String brand) {
		super(brand);
		
	}
	
	@Override //this is an annotation to help make sure we are overriding correctly
	public void run() {
		System.out.println(brand + " computer runs even faster");
	}
	
	public void save() {
		System.out.println(brand + " computer saves a lot of data");
	}
}

class HP extends Computer{

	String color;
	
	public HP(String brand, String color) {
		super(brand); //call the super constructor
		this.color = color;
	}
	
	@Override
	public void run() {
		System.out.println(brand + " computer runs slow");
	}
	
	public void save() {
		System.out.println(brand + " computer does not have a big storage");
	}
	
}

class Dell extends Computer{

	public Dell(String brand) {
		super(brand);
		
	}
	//lets not override the run() method 
	
}