package com.neotech.lesson05;

public class Task02 {

	public static void main(String[] args) {
		//Create a Java program to check if it is Friday or not. If it is Friday,
		//print "It's Friday. I am going to watch a movie." and check the
		//date, if date is 13 print "I will watch a scary movie.". If date is not
		//13 print "I will watch a comedy.". If it is not Friday, print "It is NOT
		//Friday. I am going to study JAVA."	
			
			boolean isFriday = true;
			int date = 15;
			
			// a nested if ( if .... -> else .... else
			if (isFriday)
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
//what if we have an extra condition:
//if it is 15th, then I will watch a thriller 
			
// a nested if else ( if ....else if....else)
			
			if (isFriday)
			{
				System.out.println("Its Friday so I will watch a movie");
				//is date 13
				// is date 15
				//none of those
			
				 if (date == 13)
				{
					System.out.println("I will watch a scary movie!");
				}
			
				else if (date == 15)
				{
				System.out.println("I will watch a thriller movie");
				}
				else
				{
					System.out.println("I will watch a comendy");
				}
			}
			else
				 {
					 System.out.println("It's not Friday so I will study Java");
				 }
	
	
			
			
	
	
	}

}
