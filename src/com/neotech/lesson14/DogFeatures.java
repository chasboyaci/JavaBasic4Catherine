package com.neotech.lesson14;

public class DogFeatures {

	public static void main(String[] args) {
		
		Dog2 dog1 = new Dog2();
		Dog2 dog2 = new Dog2();
		Dog2 dog3 = new Dog2();
		
		
		dog1.breed = "Husky";
		dog1.color = "white and black";
		dog1.size = "large";
		
		dog1.run();
		dog1.eat();
		dog1.sleeps();
		
		System.out.println("__________________________________________________");	
		
		dog2.breed = "Bulldog";
		dog2.color = "brown and white";
		dog2.size = "medium";
		
		dog2.run();
		dog2.eat();
		dog2.sleeps();
		
System.out.println("__________________________________________________");	
		
		dog3.breed = "Labrador";
		dog3.color = "brown";
		dog3.size = "large";
		
		dog3.run();
		dog3.eat();
		dog3.sleeps();

	}

}
