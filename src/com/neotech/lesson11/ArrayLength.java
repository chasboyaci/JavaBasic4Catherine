package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		
	//array: collections of same type data
		//String arrays : we only put String arrays
		//can't mix Strings with int for example. 
		
	
	String name = "Catherine";	
	
	String name2 = new String("Catherine");
	
	String[] students = new String[5];
	
	// default value for String is null
	//default value for int is 0 
		
	students[0]	= "Fatihcan";
	students[1]	= "Oguzhan";	
	students[2]	= "Abdullah";	
	students[3]	= "Oktay";	
	students[4]	= "Burak";	
		
	//how can we get the length of the array?	
	int arrayLength = students.length;	
	System.out.println("The length of the students array is: " + arrayLength);	
		
		
	//Another way to declare an array
	int[] scores = {90, 86, 94, 88, 80};
	
	System.out.println("The length of the students array is: " + scores.length);
		
		
		

	}

}
