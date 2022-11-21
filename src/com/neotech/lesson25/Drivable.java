package com.neotech.lesson25;

public interface Drivable {
	
	
	//java automatically adds public static final
	boolean DRIVE_FAST = true;
	
	//methods are public and implemented 
	//java adds itself abstract in front of it just because we are in an interface.
	void drive();

	
	
}

//there's no connection between Driveable and Vehicle class

abstract class Vehicles{ // they can have both implemented and unimplemented 
	
	
	//implemented method
	void start(){
		System.out.println("Vehicles can start!");
	}
	
	//unimplemented methods 
	abstract void stop();
	
}

class Cars extends Vehicles implements Drivable{

	//this has 1 implemented and 2 unimplemented 
	
	@Override
	public void drive() {
		System.out.println("Cars can drive!");
		
	}

	@Override
	void stop() {
		System.out.println("Cars can stop!");
		
	}
	
	
	
}