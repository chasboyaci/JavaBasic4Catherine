package com.neotech.lesson17;

public class Lesson16HW01 {

	public static void main(String[] args) {
		
		//Create a String that will hold a sentence. Write a program to get a new 
		//String without spaces.
		
		String str = "We are learning String Methods";
		
		String str2 = str.replace(" ","");
		System.out.println("old -> " + str + " ; length " + str.length());
		System.out.println("old -> " + str2 + " ; length " + str.length());
		
		//old -> We are learning String Methods ; length 30
		//old -> WearelearningStringMethods ; length 30
		

	}

}
