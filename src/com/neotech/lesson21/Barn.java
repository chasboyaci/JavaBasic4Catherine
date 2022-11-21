package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {
	
		Animal a = new Animal();
		//properties
		a.size = "Big";
		a.color = "Brown";
		a.age = 5;
		
		//behaviors
		// all the animals do these three things
		a.sleep();
		a.eat();
		a.displayInfo();
		
		System.out.println("____________________________________");
		
		Dog d = new Dog();
		
		//properties
		d.size = "Medium"; //coming from Animal
		d.age = 2; //coming from Animal
		d.color = "White"; //coming from Animal
		d.breed = "Huskey"; //specific to Dog object
		
		
		
		d.eat(); //coming from Animal
		d.sleep(); //coming from Animal
		d.displayInfo(); //coming from Animal
		d.bark(); //specific to Dog object
		
		System.out.println("____________________________________");
		
		
		Cat c = new Cat();
		c.size = "Small";
		c.age = 1;
		c.color = "Grey";
		c.weight = 10;
		
		c.eat();
		c.sleep();
		c.displayInfo();
		c.meow();
		
		System.out.println("____________________________________");
		
		Puppy p = new Puppy();
		p.size = "Tiny"; //coming from Animal/grandparent
		p.age = 1; //coming from Animal/grandparent
		p.breed ="Jack Russel"; //coming from Dog/parent
		p.hasPottyTraining = false; //this belongs to Puppy
		
		
		
		
		
		
		
		
	}

}
