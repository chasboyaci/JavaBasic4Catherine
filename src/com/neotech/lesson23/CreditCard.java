package com.neotech.lesson23;


//Homework 1:
   // ▪ Create a class CreditCard and define two variables, balance and interest.
   // ▪ Create an instance method that will calculate the interest based on the given balance.
   // ▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
  // ▪ Call the method by creating an object of each of the three classes.



public class CreditCard {

	int balance;
	double interest = 0.20;
	
	
	
	
	void calculate (int balance)
	{
		
		System.out.println("The interest is: " + balance * interest);
		
	}
	
}
	class Visa extends CreditCard
	{
		
		double interest = 0.15;
		
		void calculate (int balance)
		{
			System.out.println("The interest payment on your visa card is  " + balance * interest );
		}
		
		
		
	}
	
	
	class AX extends CreditCard
	{
		
		double interest = 0.18;
		
		void calculate (int balance)
		{
			System.out.println("The interest payment on your visa card is  " + balance * interest );
		}
		
		
		
	}
	
	
	
	

