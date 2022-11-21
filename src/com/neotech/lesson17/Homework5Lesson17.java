package com.neotech.lesson17;

public class Homework5Lesson17 {

	public static void main(String[] args) {
		
		//Homework 5:
			//You have a String a = “Is it saturday? Is it raining? Do we have
			//a Java Class today?” How would you find out how many
			//sentences are in that String?
		
		
		
		String sentence = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = sentence.split("[!?.]");
		
		
		for(String str : array)
		{
			System.out.println(str);
		}
		
		
		System.out.println(array.length);

	}

}
