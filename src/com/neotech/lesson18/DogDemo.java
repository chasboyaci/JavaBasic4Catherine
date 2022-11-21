package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {
		
		//How can I access the instance variable?
		///by creating an object and using reference value
		
		Dog dog1 = new Dog();
		
		dog1.name = "Qimi";
		dog1.age = 2;
		dog1.displayDogInfo();
		
		//Name : Qimi age: 2 breed: Husky paws: 4
		
		//How can I access the static variables? 
		//We can access it by using the class name
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		
		//value of instance variable
		System.out.println(dog1.name);
		
		
		Dog dog2 = new Dog();
		
		dog2.name = "Jager";
		dog2.age = 7;
		dog2.displayDogInfo();
		
		
		System.out.println("-----------------------");
		// this will change for dog1 and dog2 because it's static variables 
		Dog.breed = "Sheppard"; 
		
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		//Name : Qimi age: 2 breed: Sheppard paws: 4
		//Name : Jager age: 7 breed: Sheppard paws: 4
		
		
		Dog dog3 = new Dog ();
		
		dog3.name = "Magic";
		dog3.age = 3;
		dog3.displayDogInfo();
		//Name : Magic age: 3 breed: Sheppard paws: 4
		
		
		
		
		
		
		
		
		
		


	}

}
