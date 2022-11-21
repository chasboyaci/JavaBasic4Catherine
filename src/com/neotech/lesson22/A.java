package com.neotech.lesson22;

public class A {

	//Homework 1:
	   // Write program for multilevel inheritance where class A is inherited 
	   // by B and class B is inherited by class by C.
	
	
	//this. --> it access elements within a class
	//super. --> it accesses elements on the parent class
	String name = "A";
	
			
			void method()
			{
		System.out.println("This is a method of class A");
		
			}
	
	//Class B is not in the same class just in the same file 		
			
}

class B extends A
{
	
	String name = "B";
	
	void method()
	{
		System.out.println("This is a method in class B");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
	
}


class C extends B {
	
	String name = "C";
	
	void method()
	{
		System.out.println("This is a method in class C");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
	

	
}