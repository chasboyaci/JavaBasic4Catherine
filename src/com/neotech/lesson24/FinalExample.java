package com.neotech.lesson24;

//1. Create a class FinalExamples that has one final String variable with an initial value and one final method printVariable().
//In the main method create an object of FinalExamples class and try to reassign a value to instance variable.
//Create a sub class of FinalExamples named ChildClass and try to override the printVariable() method.

public class FinalExample {

	//instance variable
	final String str = "I love Java";
	
	final void printVariable() {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
				
		//fe.str = "I hate Java"; can't change it 
		
		fe.printVariable(); //I love Java
		
		
	}
}
