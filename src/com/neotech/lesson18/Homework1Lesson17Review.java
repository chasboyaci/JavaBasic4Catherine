package com.neotech.lesson18;

public class Homework1Lesson17Review {

	public static void main(String[] args) {
	
		//Create a String and print it in reverse order (Sunday → yadnuS). 
		   // Solve it using charAt(), toCharArray()  and reverse() methods.
		   // Note:
		        //for charAt() and toCharArray() use String
		       // for reverse you have to declare a StringBuffer object
		
	String str = "Sunday"; //this has 5 indexes because it starts counting at 0
	
	//1st way is using charAt()
	
	for(int i = str.length()-1; i >= 0; i--)
	{
		char c = str.charAt(i);
		System.out.print(c);
	}
	
	System.out.println(); //2nd way is using charArray[]
	
	char[] charArray = str.toCharArray();
	
	for(int i = str.length()-1; i >=0; i--)
	{
		char c = charArray[i];
		System.out.print(c);
	}
	
	System.out.println(); //2nd way is using reverse() method of StringBuffer
	
	StringBuffer strBuffer = new StringBuffer(str);
	
	strBuffer.reverse();
	
	System.out.print(strBuffer);
	

	System.out.println(); //3rd way is using reverse() method of StringBuilder
	
	StringBuilder strBuilder = new StringBuilder(str);
	strBuilder.reverse();
	
	System.out.print(strBuilder);
	
	System.out.println();
	
	//String is immutable, calling the toUpperCase() method
	//wont change the string
	str.toUpperCase();
	System.out.println(str); //Sunday
	
	
	String strUpper = str.toUpperCase();
	System.out.println(strUpper); //SUNDAY
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
