package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10
		
		//this is using WHILE example:
		int num = 1; 
		
		while(num <= 10)
		
		{
			System.out.println(num + " ");
			num++;
		}
		
		System.out.println("");
		
		//using FOR LOOP
		//FOR has 3 crucial loop components
		//Initializing;condition/increment 
		// the initializer is the counter/variable
		
		
		for(int i = 1; i <= 10; i++) 
		{
			System.out.println(i + " ");
		}
		//print a new line
		System.out.println();

	}

}

//FOR LOOP IS GOOD WHEN YOU KNOW HOW MANY TIMES YOU WANT TO LOOP