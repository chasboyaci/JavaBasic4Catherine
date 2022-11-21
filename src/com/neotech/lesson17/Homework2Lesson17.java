package com.neotech.lesson17;

public class Homework2Lesson17 {

	public static void main(String[] args) {
		
		//Homework 2:
		   // Write a program to print out the following conversion:
		   // Today is Tuesday and we have a Java Class!!!  to 
		   // yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		   // You can use any other string as long as the format is correct.
		
		
		String sentence = "Today is Tuesday and we have a Java Class!!!";
		System.out.println(sentence);
		
		
		
		String[] words= sentence.split(" ");
		
		
		//ehanced for loop
		for(String reverseWords : words)
		{
			for(int i = reverseWords.length()-1; i >= 0; i--)
			{
				System.out.print(reverseWords.charAt(i));
				
			
			}
			System.out.print(" ");
		}
		
			
		
		
	}

}
