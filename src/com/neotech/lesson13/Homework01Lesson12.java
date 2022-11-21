package com.neotech.lesson13;

public class Homework01Lesson12 {

	public static void main(String[] args) {
		/*
		 * 1. Create a 2D array where you will store the following values: - Mr, Mrs,
		 * Ms, Miss -Smith, Jordan, Jackson, Obama.
		 * 
		 * After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 * 
		 * Be careful because they are mixed.
		 */

		//2D ARRAYS: contails miulitple 1D arrays
		//1D Array -> contains multiple string values (it can be other data types) 
		//String[] example = {"Catherine", "Allee", "Sofie"}; //example of 1 dimensional array
		
		//String[][] names = {{"Catherine", "Allee", "Sofie"},
		//{{"Ahmet", "Bursa", "Seda"}}
	
	
	String[][] names = {
			{"Mr", "Mrs", "Ms", "Miss"},
			{"Smith", "Jordan", "Jackson", "Obama"}
			};
		
	System.out.println(names[0][1] + " " + names[1][0]);
	System.out.println(names[0][0] + " " + names[1][3]);
	System.out.println(names[0][2] + " " + names[1][2]);
	System.out.println(names[0][3] + " " + names[1][1]);
	
	
	//String[][] names = {	      Col#0  Col#1   Col#2  Col#3
			             //Row 0 {"Mr", "Mrs", "Ms", "Miss"},
			             //Row 1 {"Smith", "Jordan", "Jackson", "Obama"}
			            //};
	
	
	
	
	}

}
