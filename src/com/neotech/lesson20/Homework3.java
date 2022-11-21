package com.neotech.lesson20;

public class Homework3 {

		  //Homework 3:
		 // Write program that have static constructor and observe result.
	
		static String sentence;
		
		Homework3(String fullSentence)
		{
			System.out.println("On Thursdays we learn " + fullSentence);
		}
		
		public static void main(String[] args) {
			
			Homework3 result = new Homework3("Java!");
			
			

			
		}
		
		
		
		
	

}
