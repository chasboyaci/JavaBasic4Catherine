package com.neotech.lesson09;

public class ForLoop {
	
public static void main(String[] args) {
		
		for(int a = 1; a <= 100; a++)
		{
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		//print even numbers from 20 to 1 (2 ways)
		//print even numbers between 20 and 50 (2 ways)
		for(int c = 20; c >= 1; c--)
		{
			if (c % 2 == 0)
			{
				System.out.print(c + " ");
			}
						
		}
		System.out.println();
		for(int c = 20; c >=1; c= c-2)
		{
			System.out.print(c + " ");
		}
		
		
		//Print odd numbers between 20 and 50 (2 ways)
		
		for(int d = 20; d <= 50; d++)
		{
			if (d % 2 == 1)
			{
				System.out.println(d + " ");
			}
		}
		
		for(int d = 21; d <= 50; d +=2)	// start at 21 because it's the first off number between 20 to 50
			
		{
			System.out.println(d + " ");
		}
			
			
			
			
			
			
			
			
	}
}
