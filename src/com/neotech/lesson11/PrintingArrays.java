package com.neotech.lesson11;

public class PrintingArrays {

	public static void main(String[] args) {

int[] points = {90, 85, 95, 75, 93, 95, 100};
	

int size = points.length;

System.out.println("The length of the array totals: " + points.length);

	for(int i = 0; i < size; i++)	
	{
		System.out.print(points [i] + " ");
	}
		
		
	//how can we get the sum of all values in the points array? 
	//What about the average?
	
	int sum = 0; 
	
	for(int i = 0; i < points.length; i++)
	{
		sum += points[i];
		
	}
		System.out.println();
		
		System.out.println("The sum is: " + sum);
		
		System.out.println("The average is: " + sum/size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
