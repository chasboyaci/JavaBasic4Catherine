package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal obj1 = new Animal();
		//these are available methods to Animal Class
		obj1.eat();
		obj1.sleep();
		
		Tiger obj2 = new Tiger();
		//these are available methods to the Tiger class
		obj2.eat();
		obj2.run();
		obj2.sleep();
		
		
		//primitive casting ---> up casting/widening 
		int i = 3;
		double d = i;
		
		
		//non primitive casting
		//this is a two part sentence
								//create a Tiger object 
		//assign it to animal object 
		//putting the Tiger object into the Animal object
		//it's an Animal object but it's actually a Tiger object-run time polymorphism
		//it runs everything from animal class but from tiger only overriding ones
		
		//we are casting a Tiger object, as an Animal object
		//so we see all methods that are in Animal class
		//but when we override a method in the Tiger class
		Animal obj3= new Tiger();
		obj3.eat();
		obj3.sleep();
		//obj3.run(); //compiler error -> because the method run() is not defined in Animal class, that takes priority on Runtime
		
		//can we do downcasting - can an a parent get in the clothes of a child??
		//Down casting is not done like this:
		//Tiger obj4 = new Animal(); this is not possible 
		
		
		Tiger obj4 = (Tiger) obj3;
		obj4.run();
		
		//also we can do down-casting this way but it's not safe at all
		Tiger obj5 = (Tiger) new Animal();
		
	}

}
