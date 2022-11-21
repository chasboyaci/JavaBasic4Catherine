package com.neotech.lesson20;

public class Homework1 {

	//Homework 1:
    //Create a method that will accept a String as a parameter and return a new 
   // String that consist only of vowels. Method should be available inside 
   // the class where it was declared and executed by calling it is name.
	
	//parameter:
	//getVowels(String str)
	//intput: String str
	//output: String result
	//access within class only: private
	//access directly by name: static
	
	private static String getVowels(String str)
	{
		//here we have to implement the functionality
		
		//regex:
		//[a-f] - range
		//abcd] - only these letters
		String result= str.replaceAll("[^aeiouAEIOU]", "");
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(getVowels("Good Evening"));
		
		
		
		
		
		
		

	}

}
