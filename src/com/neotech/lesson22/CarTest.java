package com.neotech.lesson22;

public class CarTest {

	public static void main(String[] args) {
	
		//creating an object
		Car c = new Car("Toyota", "Camry");
		c.driving();
		
		FamilyCar fc = new FamilyCar();
		fc.driving();
		fc.traveling();
		
		SportsCar sc = new SportsCar("BMW", "M3", 2);
		sc.driving();
		sc.drifting();
		
		LuxurySportsCar lsc = new LuxurySportsCar("Lambo", "Mercilago", 2, 350);
		lsc.drifting();
		lsc.racing();
		
	}

}
