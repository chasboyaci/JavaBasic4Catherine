package com.neotech.lesson05;

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

	int allergyType = 3;
	
	if (allergyType == 1)
	{
		System.out.println("Don't eat peanutes");
	}
		
	else if (allergyType == 2)
	{
		System.out.println("Don't eat lactose");
	}
		
	else if (allergyType == 3)
	{
		System.out.println("Stay away from bees");
	}
		
	else if (allergyType == 4)
	{
		System.out.println("Don't eat seafood");
	}
		
	else
	{
		System.out.println("You're Healthy");
	}
		

		
		
	}

}
