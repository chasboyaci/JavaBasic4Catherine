package com.neotech.lesson03;

public class StringConcatenation {

	//concatenate -> join together using + 
	
	//main + CTRL + SPACE
	public static void main(String[] args) {
	
		String language = "Java";
		
		
		System.out.println("I love " + language + ""
				+ " Programing!");
		
		System.out.println("I love Java Programing!");
		
		
		String s1 = "I love ";
		String s2 = "programming!!!";
		System.out.println(s1 +" " + language + " " + s2);
		
		//spacing in strings
		System.out.println("Space!!!");
		System.out.println(      
				"Space!!!");
		System.out.println("    Space!!!");
		
		
		//string + number
		String s3 = "I am " + 2; //I am 2 
		String s4 = s3 +5; //I am 2+5
		System.out.println(s3);
		System.out.println(s4);
		
		
		String two = "2";
		String four = "4";
		int a = 2;
		int b =4;
		
		System.out.println(two + four);
		System.out.println(a + b);
		System.out.println(two + b); //String + number ---> bigger string 
		
		
		//order of operations in a string
		System.out.println("I have " + 2 + 4  + " apples!");
		//four operations:
		/*
		 * 1. I have 2
		 * 2. I have 24
		 * 3. I have 24 apples
		 * 
		 */
		
		System.out.println("I have " + (2 + 4) + " apples!");
		//1. 2+4=6
		//2. I have 24
		//3. I have 24 apples 
		
		
		
		
		
		
		

	}

}
