package com.neotech.lesson26;

public interface Shape {

	void calculateArea(int a);
	void calculatePerimeter(int a);
	
	
	
	
	
	
	
}

class Circle implements Shape
{

	@Override
	public void calculateArea(int a) {
		int area = 3*a*a;
		System.out.println("The area of the circle is " + area);
		
	}

	@Override
	public void calculatePerimeter(int a) {
		int per = 2*3*a;
		System.out.println("The perimeter of the circle is " + per);
		
	}
	
	
	
}

class Square implements Shape
{

	@Override
	public void calculateArea(int a) {
		System.out.println("The area of the square is " + a*a);
		
	}

	@Override
	public void calculatePerimeter(int a) {
		System.out.println("The perimeter of the square is " + 4*a);
		
	}
	
}
