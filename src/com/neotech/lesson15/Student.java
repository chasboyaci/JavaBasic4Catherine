package com.neotech.lesson15;

public class Student {
	/*
	 * Create a class Student that will have a method getGrade. 
	 * Your method should accept the score of a student and return a grade: 
	 * score > 90 - A 
	 * score > 80 -
	 * B score > 70 - C 
	 * score > 50 - D 
	 * anything else - F
	 */

	//getGrade() is the method 
	
	
	
	String score (int a)
	{
		
		if(a > 90)
		{
			
			return "score > " + a + " - A";
		}
		else if (a >= 80 && a <= 89)
		{
			return "score > " + a + " - B";
		}
		else if (a >= 70 && a <= 79)
		{
			return "score > " + a + " - C";
		}	
		else if (a >= 50 && a <= 69)
		{
			return "score > " + a + " - D";
		}	
		else
		{
			return "F";
		}
			
			
			
			
	}
	

	public static void main(String[] args) {
		
		
		Student getGrade = new Student();
		
		String results = getGrade.score(51);
		
		System.out.println(results);
		
	}
}
 
