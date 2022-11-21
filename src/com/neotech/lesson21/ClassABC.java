package com.neotech.lesson21;

public class ClassABC {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
				a.hairColor = "brown";
				a.age = 35;
				a.weight = 120;
			
				
				a.eat();
				a.sleep();
				a.displayInfo();
				
				
		System.out.println("____________________________________");
				
		ClassB b = new ClassB();
		
			b.hairColor = "black";
			b.age = 45;
			b.weight = 140;
			b.language = "Spanish";
			
			b.eat();
			b.sleep();
			b.displayInfo();
			b.Spanish();
			
		System.out.println("____________________________________");
		
		ClassC c = new ClassC();
			
			c.hairColor = "blond";
			c.age = 25;
			c.weight = 110;  
			c.language = "Turkish";
		
			c.eat();
			c.sleep();
			c.displayInfo();
			c.Turkish();
			
	}

}
