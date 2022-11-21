package com.neotech.lesson17;

public class Task01 {

	public static void main(String[] args) {
		//You have a String a = "Is it saturday? Is it raining? Do we have a Java Class today?" 
		//How would you find out how many //sentences are in that String?

				//If you find this easy: 
				//"Is it saturday! Is it raining? Do we have
				//a Java Class today.
		
		// " \ ? n t They have a special meaning in java -- use it this way: \\?
		
		System.out.println("\"Mustafa\"");
		
		// . ? --- has a special meaning in regular expression
		String sentence = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] array = sentence.split("\\?");
		
		System.out.println("Array length is " + array.length); //Array length is 3
		
		String sentence2 = sentence.replaceAll("[?]"," +");
		System.out.println(sentence2);
		
		
		//Is it saturday? Is it raining? Do we have a Java Class today?
		
		String s2 = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array2 = s2.split("[!?.]");
		
		
		for(String str : array2)
		{
			System.out.println(str);
		}
		
		

	}

}
