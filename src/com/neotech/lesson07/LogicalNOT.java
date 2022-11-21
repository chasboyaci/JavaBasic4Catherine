package com.neotech.lesson07;

public class LogicalNOT {

	public static void main(String[] args) {
	
		// ! (NOT): Reverses the value of the boolean variable
		
		boolean b1= !true;
		System.out.println(b1);

		//not only in front of the boolean variable, it can work with any
		//boolean expression 
		//(6<5) is a boolean expression
		// ! is a logical operator
		
		
		System.out.println(!(6<5)); //it prints as true because of ! added 
		
		boolean cold = false;
		
		if (!cold) //makes it become true so it will print
		{
			System.out.println("it is cold!!");
		}
		
		
		int x =6;
		
		if (x==12)
		{
			System.out.println("x is 12");
		}
		
		else
		{
			System.out.println("x is NOT 12");
		}
		
		//we can write it like this
		// != is the opposite of ==
		if (x != 12)
		{
			System.out.println("x is NOT 12");
		}
		
		
		
		
	
		
		
		
		
		
		
	}

}
