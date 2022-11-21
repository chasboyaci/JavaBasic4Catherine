package com.neotech.lesson17;

public class Homework3Lesson17 {

	public static void main(String[] args) {
		
		
		//Find out how many alpha characters are present in a String?
		//Find number of words in string?
		
		String word = "Hello1234$%*&^%";
		
		String alpha = word.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(alpha.length());
		System.out.println(alpha);
	}

}
