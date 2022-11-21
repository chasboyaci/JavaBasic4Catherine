package com.neotech.lesson17;

public class Homework1Lesson17 {

	public static void main(String[] args) {
		
		//Create a String and print it in reverse order (Sunday → yadnuS). 
	   // Solve it using charAt(), toCharArray()  and reverse() methods.
	   // Note:
	        //for charAt() and toCharArray() use String
	       // for reverse you have to declare a StringBuffer object
		
		String word = "Sunday";
		System.out.println(word);
		//System.out.println(word.length());
		
		//charArray[]
		
		char[] reverse1 = word.toCharArray();
		
		for(int i = reverse1.length-1; i >= 0; i--)
		{
			System.out.print(reverse1[i]);
		}
		System.out.println();
		
		//StringBuffer
		StringBuffer reverse2 = new StringBuffer(word);
		System.out.println(reverse2.reverse());
		
		
		//chartAt()
		
		String reverse3 = "";
		
		for(int i = word.length()-1; i>= 0; i--)
		{
			reverse3 += word.charAt(i);
			
		}
		System.out.println(reverse3);
		

	}

}
