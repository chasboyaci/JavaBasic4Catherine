package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {
		
	// first we need to create an object:
		CalculatorWithReturn obj = new CalculatorWithReturn();
		
		
	int res = obj.add(6, 4);
	System.out.println(res);
		
	
	int res2 = obj.add(5, 3);
	System.out.println(res2);
	
	int res3 = obj.multiply(5,5);
	System.out.println(res3);
	
	//we are printing the result directly instead of saving into a variable. Res is the variable
	System.out.println(obj.multiply(5,5));
	
	double res4 = obj.divide(20.0, 5.0);
	System.out.println(res4);
	
	obj.giveBackSomething();
	obj.dontGiveBackAnything();
	
	
	double average = obj.average(5, 3, 2.5);
	System.out.println(average); //prints: 3.5

			
	
	
	
	
	
	}

}
