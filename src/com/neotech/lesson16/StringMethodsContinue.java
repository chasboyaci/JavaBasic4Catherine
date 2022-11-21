package com.neotech.lesson16;

public class StringMethodsContinue {

	public static void main(String[] args) {
		
		//contains
		String sentence = "Today is Oct 22";
		boolean cont =  sentence.contains("Today"); //this is like a question:
										//does this String contain this element? true or false
										// just gives a boolean response 
		System.out.println(cont);
		
		//startsWith()
		//"Today is Oct 22";
	boolean starts = sentence.startsWith("Today");
				System.out.println("Starts with --> " + starts); //true
	
				
		//endsWith()	
		//"Today is Oct 22";
		boolean ends = sentence.endsWith("Oct");
		System.out.println("ends with --->" + ends); //false 
				
		//equals()
		String s1 = "Saturday";
		String s2 = "saturday";
		boolean equals = s1.equals(s2);
		System.out.println("equals --> " + equals); //equals --> false
				
				
		//equalsIgnoreCase()
		//String s1 = "Saturday";
		//String s2 = "saturday";
		boolean equalsIgnoreCase = s1.equals(s2);
		
		//instead of using equalsIgnoreCase()
		//String s1 = "Saturday";
		//String s2 = "saturday";
		boolean equalsLower = s1.toLowerCase().equals(s2.toLowerCase());
				System.out.println("Equals lower --> " +equalsLower ); //Equals lower --> true
		boolean equalsUpper = s1.toUpperCase().equals(s2.toUpperCase());
		System.out.println("Equals Upper --> " +equalsUpper); //Equals Upper --> true
		
		//step by step
		//String s1 = "Saturday";
		//String s2 = "saturday";
		String s1Upper = s1.toUpperCase();
		String s2Upper = s1.toUpperCase();		
			boolean compare = s1Upper.equals(s2Upper);
			System.out.println("Compare --> " +compare); //Compare --> true
				
				
		
	}

}
