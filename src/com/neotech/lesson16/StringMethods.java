package com.neotech.lesson16;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
	
		//1st way we used to create a String
		
		String name = "Catherine"; //String literal
				
		//2nd way to create a String
		String name2 = new String("Catherine");
		
		//length()
		//name is the object and when you put . and it show all the available behaviors
		int size = name.length();
		System.out.println("The size of the name is " + size);
		
		String school = "NeoTech";
		System.out.println("The size of the school name is " + school.length());
		
		String school2 = "    Neotech   ";
		System.out.println("The size of the school name is " + school2.length()); // it counts the spaces as well in the length 

		
		//toUpperCase() toLowerCase()
		
		String city = "New York";
		
		String lowercaseCity = city.toLowerCase();
		System.out.println(lowercaseCity);
		System.out.println(city.toUpperCase());
		
		System.out.println(city); //what is the value of city? New York the original one because we did not reassign
		//String objects are immutable! It does not change 
		
		
		//creating a new String, city now points to it
		city = "New York City"; //reassigning city variable
				
		//concat()

		String sentence = " The size of " + school + " is " + school.length();
		
		String name1 = "Allee";
		String lastName = "Rivas";
		
		String fullname = name1 + lastName;
		
		//using concat
		String fullName2 = name1.concat(lastName);
		System.out.println("Full name is " + fullName2);
		
		//old way
		String nameWithSpace = name1 + " " + lastName;
		System.out.println(nameWithSpace);
		
		//new way using concat
		String nameWithSpace1 = name1.concat(" ").concat(lastName); //method chaining using concat
		System.out.println(nameWithSpace1);
		
		
		//isEmpty()
		String str = " ";
		boolean isEmp = str.isEmpty();
		System.out.println(isEmp); //prints false because it's a space so it counts 
		
		//trim()
		String str2 = "  I am     very hungry     ! ";
		System.out.println(str2.trim()); //remove only spaces in the beginning and the end of the string 
		
		System.out.println("Length of str2 is " + str2.length()); //Length of str2 is 29
		//method chaining to connect trim and length
		System.out.println("Length of trimmed str2 is " + str2.trim().length());  //Length of trimmed str2 is 26
		
	int[] num = {4, 3, 6, 7};
	int sizeArray = num.length; //this is a property of the arrays. Not a method
	
	int sizeofString = "Hello".length(); // this is a string method . This () makes it a method 
		
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
