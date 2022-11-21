package com.neotech.lesson23;

public class Parent {

	//constructor
	//default
	Parent()
	{
		
		System.out.println("Parent Class Constructor");
	}
	
	//methods
	private void hello()
	{
		System.out.println("Hello from parent class");
	}
	
	//we are re-declaring a static method for this class, but not overriding 
	//the static method from the parent class
	static void bye()
	{
		System.out.println("Bye from the parent class");
	}
	
	
	
}

class Child extends Parent
{
	


Child()
{
	System.out.println("Child Class Constructor");
}
//we are not overriding here, because we don't have access to the private methods of the parent class
private void hello()
{
	System.out.println("Hello from the child class");
}

static void bye()
{
	System.out.println("Bye from the child class");
}

}