package com.neotech.lesson11;

public class TaskPractice {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print
		 * a grade B (use 2 different ways of creating an array).
		 */
		
		
		char[] grades = new char[6];
		
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[4] = 'F';
		
		
		System.out.println(grades[2]);
		
		
		char[] grades2 = {'A','B','C','D','E','F'};
		
		System.out.println(grades2[0]);
		
		
System.out.println("==================================================================================================================================================");
		
		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 */
		
		
		String[] names = new String [4];
		
		names [0] = "Catherine";
		names [1] = "Ahmet";
		names [2] = "Allee";
		names [3] = "Sophie";
		
		String[] names1 = {"Catherine", "Ahmet", "Allee", "Sophie"};
		
		System.out.println(names[1]);
		System.out.println(names1[3]);
		
System.out.println("==================================================================================================================================================");
						
/*
 * Create an array of words: Java, Saturday, day, coding, is. Print the
 * following sentence using elements of array: "Saturday is Java coding Day".
 */
		
		
	String[] words = new String[5];
	
	words [0] = "Java";
	words [1] = "Saturday";
	words [2] = "day";
	words [3] = "is";
	words [4] = "coding";
	
	String[] words1 = {"Java", "Saturday", "day","is"};
	
	System.out.println(words[1] + " " + words[3] + " " + words[0] + " " + words[4] + " " + words[2]);
		
		
	System.out.println(words.length);
		
	}

}
