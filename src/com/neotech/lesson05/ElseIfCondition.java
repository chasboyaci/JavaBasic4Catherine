package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		double d1 = 15.5;
		double d2 = 15; // this is widening 
		
		//d1 > d2 -> same as saying that d2 < d1
		//d1 == d2 
		//d1 < d2
		
		if (d1 > d2)		
		{
			System.out.println("Number " + d1 + " is larger than " + d2);
		}
		else if (d1 < d2)
		{	
			System.out.println("Number " + d1 + " is less than " + d2);
		}
		else
		{
			System.out.println("Number " + d1 + " is equal to " + d2);
		}
		
		int a = 5; 
		int b = 7; 
		
		//possible situations:
		//1. a == b 
		//2. a < b same as b > a 
		//3. b < a same as a > b
		
		//else if used for exclusive option: meaning, if one of them is true
		// then all the others are false
		if ( a == b )
		{
			System.out.println("Number " + a + " is equal to " + b);
		}
		
		else if (a < b)
		{	
			System.out.println("Number " + a + " is less than " + b);
		}
		else if ( a > b)
			
		{	
			System.out.println("Number " + a + " is larger than " + b);
		}
		
		//Write a program. Create a variable day ( 1 - 7)
		//For every weekday, print "Today is Monday and we are working."
		//For weekend, print "We are on a break on Weekend."
		
		int day = 4;
		
		if (day == 1)
		{
			System.out.println("Today is Monday and we are working");
		}
		else if (day == 2)
		{
			System.out.println("Today is Tuesday and we are working");
		}
				
		else if (day == 3)
		{
			System.out.println("Today is Wednesday and we are working");
		}
		
		else if (day == 4)
		{
			System.out.println("Today is Thursday and we are working");
		}
		
		else if (day == 5)
		{
			System.out.println("Today is Friday and we are working");
		}
		
		else 
		{
			System.out.println("We are on a break on Weekend");
		}
	}
}
