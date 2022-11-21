package com.neotech.lesson24;

public class OverloadingMainMethod {

	public static void main(int[] args) {
		
		//overloading is same method name but different signatures 
		
		System.out.println("Main method with string array parameter");
	
	}
	
	private static void main(String arg1, String arg2)
	{
		System.out.println("Main method with two string parameters");
	}
	
	
	public static void main(int arg1, int arg2)
	{
		System.out.println("Main method with two integer parameters");
	}
	
	public static void main(String[] jenn)
	{
		System.out.println("Main method with string array parameter");
		
		OverloadingMainMethod.main(3,5);

	//do I need the class name to call the methods? NO 
		main("Hi", "Bye");
		
		
		int[] intArray = {1,2,3,4};
		main(intArray);
		
		
	}
	

	
	
	
}

