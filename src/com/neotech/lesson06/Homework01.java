package com.neotech.lesson06;

public class Homework01 {

	public static void main(String[] args) {
		
		/*Homework 1: 
		* Write a java program to check if a patient has allergies.
	    *If the patient does not have allergies print “You’re healthy!”.
	    *If the patient has allergies, check if it is a peanut allergy, lactose 
	    *allergy, bee allergy or seafood allergy 
	    *and print a statement telling the patient 
	    *“Don’t eat ___”. (fill the line with the food names – peanut, seafood etc.)
		*/
		
		boolean allergy = false;
		boolean peanut = false;
		boolean lactose = false;
		boolean bee = false;
		boolean seafood = false; 
		
		if (allergy)
			//the patient has allergies)
		{
			System.out.println("You have an allergy");
			
			if (peanut) // this is a NestedIf. Must be within the if {}.
				// is Allergy is true the compiller will then look at the if's  
				// to see which allergy they have 
				//the patient has peanut allergy
			{
				System.out.println("Don't eat peanuts");
			}
			
			if (lactose)
			{
				System.out.println("Don't eat lactose");
			}
			
			if (bee)
			{
				System.out.println("Stay away from bees");
			}
			if (seafood)
			{
				System.out.println("Don't eat seafood");
			}
		}
		else
		{
			System.out.println("You're healthy!");
		}
	}

}
