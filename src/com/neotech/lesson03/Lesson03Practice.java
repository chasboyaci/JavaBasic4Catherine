package com.neotech.lesson03;

public class Lesson03Practice {

	public static void main(String[] args) {
	/* Practice Part 1 String
	 * Notes: 
	 * When typing out String the S must be capital
	 * the name of the string is called the variable because what it equals to
	 * changes
	 * What you want the string print will need to be in "" 
	 * Keep in mind if what you want to print should instead be another 
	 * primitive type like char or int if it's only going to be a letter or one 
	 * digit
	 */
		
		String name = "Catherine";
		String lastName = "Hasboyaci";
		char grade = 'A';
		String city = "Saint Cloud";
		String state = "Florida";
		long phoneNumber = 4073460358L;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		
		//Practice part 2 Concatenation 
		/* Notes: linking things together. In this example making a complete
		 * sentence with the variables 
		 * The additional content needs to be within quotes and make sure to
		 * leave a space at the end then place a + sign before the variable 
		 */
		
		System.out.println("My name is "+name);
		System.out.println("My last name is " +lastName);
		System.out.println("My grade is " +grade);
		System.out.println("I live in the city of " +city);
		System.out.println("I live in the state of " +state);
		System.out.println("My phone number is " +phoneNumber);
		
		/* Practice 3 doing calculations 
		 * Notes
		 */
		//Practice 1 Sum
		int num1 = 46;
		int num2 = 90;
		
		System.out.println(num1 + num2);
		
		//Practice 2 Convert Fahrenheit to Celcius
		int f = 180;
		double c = (f-32)*5/9;
		
		System.out.println(c);
		
		//Practice 3 Convert Miles to Kilometer * miles by 1.6 
		
		int miles = 20;
		double kilometer = miles * 1.6;
		
		System.out.println(kilometer);
		
		//Practice 4 area and perimeter 
		
		double r = 5.5;
		double perimeter = 2 * r;
				
		System.out.println(2 * 5.5);
		
		//Practice 5 Area of a rectangle 
		
		double w = 4.5;
		double h = 7.9;
		double a = w * h;
		System.out.println(a);
		
		// Practice 6 Calculate Average
		
		int n1 = 20;
		int n2 = 45;
		int n3 = 63;
		double avg = (n1 + n2 + n3)/3;
		
		System.out.println(avg);
		
		//Practice 7 print out area and perimeter
		
		int w1 = 5;
		int h1 = 8;
		
		int a1 = h1 * w1;
		int p1 = 2 * (h1*w1);
		
		System.out.println("The perimeter of a rectangle with width " + w1 +
				 " and height " + h1 + " equal to " + p1 + " and the area is " + a1);
		
		
	}


}
