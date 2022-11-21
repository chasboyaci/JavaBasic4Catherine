package com.neotech.lesson22;

public class Parent {
	
	String name = "Parent Name";
	String lastName = "Parent LastName";
	
	
	void hello()
	{
		System.out.println("Printing from parent class");
	}
	

}

//outside of the Parent class

class Child extends Parent
{
	String name = "Child Name";
	
	
	void display()
	{
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(super.lastName);
		System.out.println(lastName);
		System.out.println(this.lastName);
	}
	
	void hello()
	{
		System.out.println("Printing from child class!");
	}
	
	void sayHello()
	{
		display(); //java adds this. in front of it can calls it 
		
		hello(); //java add this. in front of it and will call it from this class. 
		
		super.hello(); //we are specifying that we want to call
		//the hello() from the super class
		
	}
}