package com.neotech.lesson0205;

public class HomeworkJava03 {

	public static void main(String[] args) {
		//1. Write a java program to display the area and parimeter
		//of a circle that has a radius of 5. Use pi = 3.

		int radius =5;
		int pi = 3;
		int area = (radius*radius*2);
		int perimeter = (2*pi*radius);

		
		System.out.println(area);
		System.out.println(perimeter);
				
		
		//Write a java program that converts mile to km and km to miles.
		//Use scale 1 mile = 1.609344.
		
		
		int km = 2;
		int miles = 1; 
		double kmToMiles = (km*0.62137);
		double milesToKm = (miles*1.60934);
		
		
		System.out.println(kmToMiles);
		System.out.println(milesToKm);
		
		
		
		
	}

}
