package com.neotech.lesson23;

public class ParentChildTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		//p.hello(); can't access because it's private 
		Parent.bye();
		
		//Parent Class Constructor
		//Hello from parent class
		//Bye from the parent class
		
		
		
		System.out.println("_______________");
		
		
		Child c = new Child();
		//c.hello();
		Child.bye();
				
		//Parent Class Constructor this is printed because it goes to the parent class first 
		//Child Class Constructor
		//Hello from the child class
		//Bye from the child class
		
		
		
		
		
		
		
		
		
		

	}

}
