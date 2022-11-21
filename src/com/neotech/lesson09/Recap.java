package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		
	//How can we print Good Evening 5 time?
		
	//We can use a WHILE LOOP
	//We are responsible for where and when we start
	//We are responsible for when the loop stops
		
		int count = 1;
		
		while (count <= 5 ) // or count < 6
		{
			System.out.println("Good evening ");
			count++; //count = count + 1 or count += 1. This makes it stop once the condition is false
		}	// count < = 5 will be true from 1-5 then beyond that it will be false and will stop printing
		// it's a increment ++ because we are increasing the count 1 to 5 
		
		//USING DO WHILE
		// do the condition second (System.out.println("Good Evening"); 
		//then doing while (num <= 5)
		int num = 1;
		
		do 
		{
			
			System.out.println("Good Evening!");
			num++;
		}
		
		while (num <= 5);
		
		
	//difference between while and do while
	//do while prints first before checking the condition
		
		//while example
		int n1 = 10;
		while (n1 <= 5)
		{
			System.out.println("Good night");
			n1++;
		}
		
		//do while example
		int n2 = 10;
		do
		{
			System.out.println("Good night! " + n2);
			n2++;
		}
		while(n2 <= 5); //only printed once Good night because it's false
		// with do while it prints the sentence before checking the condition
		//do while increases by 1 than checks if it's true or false 
		//While always checks the condition to see if it's true to print or 
		//false to not print.
		
		
		
		
		//while(is always a boolean)
		
		
	}

}
