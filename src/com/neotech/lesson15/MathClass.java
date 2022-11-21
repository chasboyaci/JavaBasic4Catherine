package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		
		//object from Calculator class. This will connect to the class 
		// the cal (object) gets connected to the class (Calculator) by using the following process:
		Calculator cal = new Calculator();
		
		//cal is an object that exist from the Calculator Class
		// the add, multiply, and divide are the methods inside of the cal object
		
		System.out.println("Addition");
		cal.add( 5,7); // a, b from the addition section of the Calculator class
		cal.add(10,15);
		cal.add(300, 125);
		
		System.out.println("Multiply");
		cal.multiply(5,7); // a, b from the Multiply section of the Calculator class
		cal.multiply(6,2);
		
		
		System.out.println("Division");
		cal.divide(8,3); // a, b from the division section of the Calculator class
		cal.divide(55.2, 13.5);
		//cal.divide(3.5, 0); the most common issue when dividing, is division by 0 
		System.out.println(3.0/0); //prints: infinity

	}

}
