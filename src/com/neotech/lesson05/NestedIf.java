package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {

	//if it is morning  -> say good morning
		// if it is a school day - you are at school
		//else you are at home
	//else (not morning) ---> good afternoon
		
	boolean isMorning = false; //its false so the else will print instead
	boolean isSchoolDay = false; 
	
	if (isMorning) // this: if (isMorning) and else is called the outer 
					// if (isSchoolDay) and else is the inner
					// if and else if works for boolean variables and anything 
		//that resembles a boolean variable like the < > ==
	{
		System.out.println("Good morning");
		if (isSchoolDay)
		{
			System.out.println("You are at school");
		}
		else
		{
			System.out.println("You are at home");
		}
	}
	else
	{
		System.out.println("Good afternoon");
	}
		
	//Create a Java program to check if it is Friday or not. If it is Friday,
	//print "It's Friday. I am going to watch a movie." and check the
	//date, if date is 13 print "I will watch a scary movie.". If date is not
	//13 print "I will watch a comedy.". If it is not Friday, print "It is NOT
	//Friday. I am going to study JAVA."	
		
		boolean friday = true;
		int date = 13;
		
		if (friday)
		{
			System.out.println("It is Friday. I am going to watch a movie");
			
			if (date == 13)
			{
				System.out.println("I will watch a scary movie");
			}
			else {
				System.out.println("I will watch a comedy");
			}
		}
		else
		{
			System.out.println("It is NOT Friday. I am going to study JAVA!");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
