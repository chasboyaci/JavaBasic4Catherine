package com.neotech.lesson19;

public class Task2 {
	
	//Create a method that will take a String as a
	//parameter and returns reversed String. Method
	//should be available to all classes within your project
	//and accessible by class name.

	
	public static String reverse(String str)
	{
		//here is the inner side of the factory
		//many ways on how we can do this
		//first way
		
		String reversed = "";
		for(int i = str.length()-1; i >=0; i--)
		{
			reversed +=str.charAt(i);
		}
		
	
		return reversed;
		
	}
	
	//we learned Strings are immutable, so creating a String all the time is not very optimal
			//so, we can use mutable strings (StringBuffer or StringBuilder
			
			//return the reversed String
	
	
	public static StringBuffer reverse2(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
