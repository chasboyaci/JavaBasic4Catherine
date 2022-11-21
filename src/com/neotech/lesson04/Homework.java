package com.neotech.lesson04;

public class Homework {

	public static void main(String[] args) {

//1. area and perimeter
		
	int radius = 5;
	int pi = 3;
	int perimeter = (2*pi*radius);
	int area = (radius*radius*pi);
						
	System.out.println(area);
	System.out.println(perimeter);
				
				
//2. Convert Miles to Kilometer * miles by 1.6 
				
	double mile, km, scale;
	
	scale = 1.609344;
	mile = 2;
	
	km = mile * scale; 
	
	System.out.println(mile + " miles is " + km + " kilometters");
	
	double km2 = 60;
	double miles2 = km / scale;
	
	System.out.println(km2 + "kilometer is " + miles2 + " miles");
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
