package com.neotech.lesson03;

public class StringExamples {

	public static void main(String[] args) {
	
		//primitive data types: byte....booe=lean
		//non-primitave: String
		//variables: is something that changes (age)
		//int age = 25;
		//age = 30;
		//char ch = 'c';
		
		//type  identifier = value 
		//String has to be capital
		//schoolName is the variable ( the schoolName can changeP 
		//example of non=primitive 
		// "" is for more than one character and '' is for one character
		//camelCase is when you capitalize the second name in the String
		String schoolName = "NeoTech";
		String name = "Catherine";
		int age = 35;
		String income = "140k";
		String nationality = "American";
		
		//income increased so you do the following:
		income = "150k";
		
		System.out.println(schoolName);
		System.out.println(name);
		System.out.println(age);
		System.out.println(income);
		System.out.println(nationality);
		
		
		income = "160k";
		//wont print 160k. It will print the last one Before the exec code
	}
	
	

}
