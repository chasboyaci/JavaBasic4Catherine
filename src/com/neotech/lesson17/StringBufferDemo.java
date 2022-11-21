package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//how did we create a String
		String a = "Hello"; //string literal
		String b = new String("Hello1"); //String is a class, we are creating an object
		
		//when we want to change the String frequently
		StringBuffer sb = new StringBuffer("Hello2");
		
		System.out.println(sb); //Hello2
		
		//we can change the string buffer object, without the need to create a new one
		sb.append(" All"); //string is added to the sb object
		System.out.println(sb); //Hello2 All
		
		//if we do it as:
		a = a + " All";
		//a = new String("Hello All"); this is what java needs to do. This is less efficient 
		System.out.println(a);
		
		
		//String is immutable --- once created it cannot be changed 
		
		//StringBuffer and StringBuilder are mutable ----- we create a string and we can change it without creating a new object.
		//we can change the existing string
		
		
		System.out.println(sb.length()); //10
		System.out.println(sb.reverse()); // llA 2olleH // no need to use for to print in reverse
		
		String subStr = sb.substring(2, 5);
		System.out.println(subStr); //A 2 it's looking at llA 2olleH
		
		
		//an example with StringBuffer and StringBuilder
		StringBuffer strBuff = new StringBuffer(" ");
		
		StringBuilder strBld = new StringBuilder("It is late, ");
		strBld.append("but we won't stop!");
		System.out.println(strBld); // It is late, but we won't stop!
		
		
	}

}
