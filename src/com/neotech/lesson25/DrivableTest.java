package com.neotech.lesson25;

public class DrivableTest {

	public static void main(String[] args) {
		
		
		//cant' creat an object
		//Drivable d1 = new Drivable()

		
		Drivable d2 = new Cars(); //upcasting 
		d2.drive();
		
		System.out.println(Drivable.DRIVE_FAST);
		//cannot change final variables of the interface
		//Drivable.DRIVE_FAST = false;
		
		Vehicles v1 = new Cars(); //upcasting 
		
		v1.start();
		v1.stop();
		
		
		Cars c1 = new Cars();
		c1.drive();
		c1.start();
		c1.stop();
		
		
		
		
	}

}
