package com.neotech.lesson09;

public class ForLoopExtra {

	public static void main(String[] args) {
		
		System.out.println("Print numbers from 21 to 30");
		
		for(int i = 21; i <= 30; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println(); // to put a space between examples
//--------------------------------------------------------------------
		System.out.println("Print numnes from 20 to 1");
		for(int i = 20; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
//--------------------------------------------------------------------		
		//another example
		
		System.out.println("Print odd numbers from 1 to 10");
		for (int i = 1; i <=10; i+=2) //i+=2 will add 2 starting to 1 so the next number will be odd
		{
			System.out.println(i + " ");
		}
		System.out.println();
//--------------------------------------------------------------------		
		System.out.println("Print odd numbers from 1 to 10 - 2nd way");
		for(int i = 1; i<= 10; i++)
		{
			//if i % 2 == 1 ---> i is odd (remainder is 1)
			// if i % 2 == 0 ---> i is even (remainder is 0)
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
//-------------------------------------------------------------------		
		System.out.println("Print odd numbers from 1 to 10 - 3rd way");
		for(int i = 1; i <=10; i++)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println(); // this example has i++ in 2 places so it's 
		// adding a 1 at two times starting from 1 making the next
		//number automatically odd
//----------------------------------------------------------------------		
		//another example
		System.out.println("\nPrint the sum of numbers from 3 to 7");
		int sum = 0;
		for(int i = 3; i <= 7; i++) 
		{
			sum += i; //sum = sum + i;
		}
		
		System.out.println("Sum is : " + sum);
		
		
	} 

}
