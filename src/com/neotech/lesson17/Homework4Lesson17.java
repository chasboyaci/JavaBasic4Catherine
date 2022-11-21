package com.neotech.lesson17;

public class Homework4Lesson17 {

	public static void main(String[] args) {
		
		
	String sentence = "Learning Java is fun!!";
	System.out.println(sentence);
	
	String[] words = sentence.split("||");
	
	String reverseWords = "";
	
	for(int i = words.length-1; i >=0; i--)
	{
		reverseWords += words[i];
	}
	System.out.print(reverseWords);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
