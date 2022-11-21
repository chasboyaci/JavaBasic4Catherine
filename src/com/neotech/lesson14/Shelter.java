package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {
		
		//create objects using the Dog class
		
		Dog dog1 = new Dog();
		dog1.breed ="Bulldog";
		dog1.size ="Big";
		dog1.color = "Black";
		dog1.age = 2;
		
		dog1.eat();
		dog1.run();
		dog1.bark();
		
	System.out.println("_________________________________-");	
		
		Dog dog2 = new Dog();
		dog2.breed ="Golden Retriever";
		dog2.size ="Big";
		dog2.color = "golden";
		dog2.age = 5;
		
		
		dog2.eat();
		dog2.run();
		dog2.bark();
		
		System.out.println("_________________________________-");	
		
		Dog dog3 = new Dog();
		dog3.breed ="Yorkie";
		dog3.size ="Small";
		dog3.color = "brown and black";
		dog3.age = 5;
		
		
		dog3.eat();
		dog3.run();
		dog3.bark();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
