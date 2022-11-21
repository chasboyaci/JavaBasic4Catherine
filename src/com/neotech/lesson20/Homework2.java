package com.neotech.lesson20;

public class Homework2 {

	//Homework 2:
	//Write a program that will have 4 different access levels of constructors 
	//and create 3 objects of this class: 
	//1 -inside same class; 
	//2 -from outside the class; 
	//3 -from different class inside different package and observe result.
	
	String studentName, studentLastName;
	int studentId;
	
	Homework2 ()
	{
		System.out.println("no parameters");
	}
	
	public Homework2(String studentName)
	{
		System.out.println(studentName);
	}
	
	protected Homework2(String studentName, String studentLastName)
	{
		System.out.println(studentName +  " " + studentLastName);
	}
	
	private Homework2 (String studentName, String studentLastName, int studentId)
	{
		System.out.println(studentName + " " + studentLastName + " " + studentId);
	}
	
	
	public static void main(String[] args) {
		
		Homework2 st1 = new Homework2();
		Homework2 st2 = new Homework2("Catherine");
		Homework2 st3 = new Homework2("Catherine", "Hasboyaci");
		Homework2 st4 = new Homework2("Catherine", "Hasboyaci", 987654321);
		
		
	}
}
