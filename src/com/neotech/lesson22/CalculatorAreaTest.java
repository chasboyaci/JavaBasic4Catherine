package com.neotech.lesson22;

public class CalculatorAreaTest {

	public static void main(String[] args) {
		
		
		
	//if you don't use static, you have to create an object. if you use static, 
	//you don't need an object.	
		
		//this is using static instead of void
	CalculateArea.area(5);	
	CalculateArea.area(6,7);
	CalculateArea.area(5, 6, 7);
		
		//if these were instance (void) methods need to do this:
	//CalculateArea ca = new CalculateArea();
	//ca.area(5);

	}

}
