package com.neotech.lesson16;

import java.util.Scanner;

public class StringMoreMethods {

	public static void main(String[] args) {
		//charAt()
		
		//Scanner scan = new Scanner(System.in);
		//char letter = scan.next().charAt(1);
		//System.out.println(letter); //prints e of Hello because Java starts counting at 0

		String name = "Catherine";
		char letter1 = name.charAt(1);
		System.out.println("Letter: " + letter1); //prints Letter: a
		
		
		//indexOf()
		int index = name.indexOf('e');
		System.out.println("Index of e is: " + index); //Index of e is: 4. It's the number character of my name Catherine
		
		String name1 = "Sophie";
		System.out.println("Index of o is --> " + name1.indexOf('o')); //prints Index of o is --> 1
		System.out.println("Index of o is --> " + name1.indexOf("ie")); //prints Index of o is --> 4. It counts where it starts
		
		//subString()
		String message = "Today is a very good day!";
		String substr = message.substring(3);
		System.out.println(substr); //prints starting at element 3 of the string. It counts spaces as well: "ay is a very good day!"
		
		String substr2 = message.substring(6, 8); //using two parameters. where should be beginning and where we should end 
		System.out.println(substr2); // prints: "is" . It prints from element 6 to 8 
		
		
		
		
		
		
		
		
		
	}

}
