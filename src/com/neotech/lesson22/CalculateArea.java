package com.neotech.lesson22;

public class CalculateArea {

	//Create a class named CalculateArea in which you
	//should create three methods (with the same name )that
	//will calculate the area (volume) of
	//- Rectangle - Square - Box
	//Use a separate class to test your code
	
	//rectangle
	//signature: (int, int)
	static void area(int side1, int side2)
	{
		System.out.println("The area of the rectrangle is ---> " + side1 * side2);
	}
	
	
	
	
	//square
	//signature: (int)
	static void area(int side)
	{
		System.out.println("The area of the square us ---> " + side * side);
	}
	
	
	//signature: ( int, int, int)
	static void area (int length, int width, int height)
	{
		System.out.println("The area of the box is --> " + length*width*height);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
