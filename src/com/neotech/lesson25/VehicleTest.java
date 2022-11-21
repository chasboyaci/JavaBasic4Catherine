package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {
		
		//we can't a Vehicle because it's an abstract class
		
		//Car c = new Car("Red", "Tesla"); can't do this either because it's an abstract class
		
		Vehicle v1 = new Tesla("Red", "Tesla"); //upcasting/un-casting
		
		//we can only call the methods in the Vehicle class
		v1.start();
		v1.stop();
		v1.drive();
		v1.brake();
		
		System.out.println("___________________");
		
		Toyota toyota1 = new Toyota("Black", "Camry");
		
		Vehicle toyota2 = new Toyota("Grey", "Rav4");
		
		
		toyota1.start();
		toyota2.start();
		
		Tesla tesla1 = new Tesla("Red", "Model S");
		
		Vehicle tesla2 = new Tesla("Yellow", "Model 3");
		
		tesla1.display();
		//tesla2.display();
		
	}

}
