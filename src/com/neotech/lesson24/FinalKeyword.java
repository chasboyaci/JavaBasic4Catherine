package com.neotech.lesson24;

public class FinalKeyword {

	public static String str = "Hello";
	
	
	//Final variable = constant! cannot be reassigned 
	
	public static final String str2 = "Bye";
	
	public final double PI = 3.141526; //PI will always have this value 
	
	public static void main(String[] args) {
		
	str = "Hi"; //we are allowed to change it because it's just the String. public static String str = "Hello";
		
	//str2 = "Try me"; not allowed because str2 is final 
	
	//local variable
	final String finalStr = "Java is easy";
	//finalStr = "Java is difficult"; CE (compiler error, cannot change a final variable
	
	
	final int age = 28;
	//after one year
	//age = 29;  can't change it 
	
	
	}
	
	//final method cannot be overridden
	public final void name()
	{
		
		System.out.println("Hello, I am a final method");
		
		
	}
	
	//THIS IS OVERLOADING with different signatures 
	//We are allowed to do this 
	public final void hello(String name) {
		System.out.println("Hello " + name);
		
	}
	
}
	class SubClass extends FinalKeyword{
		
		//lets override the first hello
		//@Override
		//public void hello() //Compiler error: cannot override a final method 
		
		
		
		
		//Not overriding! Method signature is different: just another method 
		public void hello(int num)
		{
			
		}
		

	}
	
	

