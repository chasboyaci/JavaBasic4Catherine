package com.neotech.lesson07;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

public class RecapScanner {

	public static void main(String[] args) {


	//Class name = the new class name
	Scanner input = new Scanner(System.in);
	//CTRL + SHIFT + O to import scanner
	
	
	//Declaring strings
	String text1, text2, text3;
	int age, year;
	double salary;	
	boolean isRaining;
	char gender;
	
	//example 1
		//System.out.println("Enter a sentence");
		//text1 = input.next(); //reads until it finds a space and gives back
		//what it read 
		//System.out.println(text1); //printed Today
		
		
		//text2 = input.next();
		//System.out.println(text2);//printed the second word in the sentence 
		
		
		//text3 = input.nextLine();// putting nextLine includes the space before 
		//the word. read the rest of the sentence
		//System.out.println(text3);	
		
		//what is the difference between input.next() and input.nextLine()
		//nextLine reads/prints the rest of the sentence and next will only read 
		//the next word and will stop at the space. 
		
	//example2
		//System.out.println("What is your age");
		//age = input.nextInt();//age is the int
		//System.out.println("Age:" + age);
		//System.out.println("What year is it");
		//year = input.nextInt();//year is the int. The nextInt is needed because
		//year and age was declared as a int at the start
		//System.out.println("Year:" + year);
	
	//group comment ctrl + shift +/
		
	
	//Sytem.out.println("Enter your age and year: "); age =input.nextInt();
	//year = input.nextInt(); System.out.println(age + " " + year);
	//example 3: added boolean to the declaring variable at the top 
	
	//System.out.println("Enter your salary:");
	//salary = input.nextDouble();
	//System.out.println(salary);
	
	/*
	 * System.out.println("Is it raining?"); isRaining = input.nextBoolean();
	 */
	
	//System.out.println("Enter your gender ((M or F)");
	//gender = input.next().charAt(0);//method chaining. two methods one after the
	//other. 
	
	// this is separating into 2 steps or you can use the example above to 
	//combine them 
	
	/*
	 * //1. reads the word with next() String str = input.next(); //2. get the char
	 * you need with charAt() gender = str.charAt(1);//putting a 1 means it will
	 * read the second letter // in the word. //when putting charAt(0) will read the
	 * first letter of the word System.out.println(gender);
	 */
	
	/*
	 * System.out.println("Enter your name, city, age, gender, and salary");
	 * //Catherine, Orlando, 35, female, 150,0000 text1 = input.next(); //for name
	 * text2 = input.next(); //for city age = input.nextInt(); gender =
	 * input.next().charAt(0);// 0 because indexing starts at 0. salary =
	 * input.nextDouble(); System.out.println(text1 + " " + text2 + " " + age + " "
	 * + gender + " " + salary);
	 */
	
	
	
	
	
	
	
	
	
	
	
	}

}
