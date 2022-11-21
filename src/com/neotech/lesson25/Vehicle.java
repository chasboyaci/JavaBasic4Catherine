package com.neotech.lesson25;

public abstract class Vehicle {

	String color;
	//constructor
	Vehicle(String color){
		this.color = color;
	}
	//methods
	public void drive() {
		System.out.println("Vehicle drives!");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	//abstract methods
	public abstract void start();
	
	public abstract void brake();
	
	
	
}


abstract class Car extends Vehicle{

	String carType;
	
	Car(String color, String carType) {
		super(color);
		this.carType = carType;
		
	}

//implement abstract void brake();

	public void brake() {
		System.out.println(carType + " have brakes!");
	}
	
	//We can create other abstract methods here
	//public abstract void carDetails();

	
}

class Tesla extends Car{

	Tesla(String color, String carType) {
		super(color, carType);
		
	}

	//implementing the abstract method 
	@Override
	public void start() {
		System.out.println(carType + " start remotely!");
		
	}
	//adding a new method 
	public void display() {
		System.out.println("We have " + color + " " + carType);
	}
	
	
}

class Toyota extends Car{

	Toyota(String color, String carType) {
		super(color, carType);
		
	}

	@Override
	public void start() {
		System.out.println(carType + " has a keyless start");
		
	}
	
}





