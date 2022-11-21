package com.neotech.lesson10;

public class Homework1 {

	public static void main(String[] args) {
/*
 * 		 *********
		  *******
		   *****
		    ***
		     *
 * 
 * 
 * 
 * 
 */
		
		 
	for (int i = 9 ; i>=0 ; i=i-2) { //this is for the range of the columns
		
		
		
		for (int z = 8 ; z > i ; z = z-2) // first it's 8 > 9 not true so it goes to the next for
		{
			System.out.print(" ");
		}
	
		
		
		for (int j =1 ; j <= i ; j++) { // then 1 <= 9 true so it will print the + and the will increase by 1, 
		// j++ 2<=9 prints *, 3<=9 prints *, 4<=9 prints * ..... until it becomes false at 10<=9
		// it will then go to the first for
		// i will decrease by 2 and become 7
		// z will remain 8 and i will be 7 8 > 7 
		// z will decrease by 2 to because 6 
			
			
			System.out.print("*");
			
		}
		
		System.out.println();
		
	
	}
		
		
	
	
	
	
	
	
	
	}
	
}
