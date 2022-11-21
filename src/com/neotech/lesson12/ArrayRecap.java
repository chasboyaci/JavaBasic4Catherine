package com.neotech.lesson12;

public class ArrayRecap {

	public static void main(String[] args) {
		//Basic integer array
		
	int[] grades = new int[5];
	//lets print the size of the array
	System.out.println("The size of the array is: " + grades.length);
	
	//element with index #2
	System.out.println("The third element of the array is: " + grades[2] );

	grades[3] = 85;
	grades[1] = 90;
	//error: index 5 does not exist because it starts at 0 and we put the size to 5 which is 0-5
	//grades[5] = 100;
	grades[2] = 100;
	grades[0] = 93;
	grades[4] = 78;
	
	//re-assign the values of an element
	grades[4] = 98;
	
	
	int size = grades.length;
	
	System.out.println("The size of the array after assigning the values is " + size);
	
	//element with index #2
		System.out.println("The third element of the array is: " + grades[2] );

	//let's find the total of all elements of the array
		int total = grades[0] + grades[1] + grades[2] + + grades[3] + grades[4];
		System.out.println("Total is " + total);
		
		//find the average of the array
		
		int average = total / grades.length;
		System.out.println("The average is " + average);
		
	//2nd way: let's find the total using a for loop
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			sum += grades[i]; //sum = sum + grades[i];
		}
		System.out.println("Total is " + sum);
		
		int avg = sum / grades.length; // or avg = sum/size
		System.out.println("The average is " + avg);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	//String array uses {} instead of []
	String[] cities = {	"Paris" , "New York", "London", "Istanbul", "Tokyo", "Dushanbe"};
	
	System.out.println(cities[3]); //prints Instanbul
		
	System.out.println("The size of my String array: " + cities.length);	
		
	//How to print the cities
	
	for(int i = 0; i < cities.length; i++ )
	{
		System.out.println(cities[i]);
	}
		
		
		
		
	
	
	}

}
