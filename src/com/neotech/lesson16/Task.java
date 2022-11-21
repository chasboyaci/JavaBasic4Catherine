package com.neotech.lesson16;

public class Task {

	public static void main(String[] args) {
		
		//Create a String  an.d print it in reserve order
		//(Sunday -> yadnuS)
		
		//combine for loop with charAt()
		
		String sun = "Sunday";
		
		String reverse = "";
		
		//first loop: get y and add it to the reverse y
		//second loop: get a and add it to the reverse ya
		
		//we have to put -1 because it starts at 0
		for(int i = sun.length()-1; i >= 0; i--) // or : for(int i = 0; i < sun.length; i++
		{
			reverse += sun.charAt(i);
		}
		
		System.out.println(reverse); //prints: yadnuS
		
		

	}

}
