package com.neotech.lesson08;

public class IntroToDoWhileLoop {

	public static void main(String[] args) {
		
		//while loop:
		//check the condition
		//if the condition is false, then we do not check again
		//if the condition is true, we keep executing and checking until it 
		//becomes false
		
		int num1 =5;
		
		while (num1 >= 15)
		{
			System.out.print(num1 + " ");
			
			num1++;
			
			//false to it prints nothing
			
		}
		
		
		
		//Using Do....While
		int num2 =5;
//Do While loop:
//first execute the body once 
//than check the condition
//if the condition is false, then do not run anymore
//if the condition is true, then continue to executing until it becomes false
		
		
		do
		{
			System.out.print(num2 + " ");
			num2++;
			
		}
			while(num2 >=15);
		
		
	
		
		
		
		
		
		
		

	}

}
