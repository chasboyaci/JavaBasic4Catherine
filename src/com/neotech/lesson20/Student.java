package com.neotech.lesson20;

public class Student {
	
	
	//Write a java program of Class Students that takes students
	//name and 3 subject grades. Inside your class also have a
	//method to Calculate Average Grade. Test Student class for 5
	//different students with different marks. Your program should
	//print an average mark of each students name.
	
	String name;
	
	int algebra, science, hitory;
	
	Student()
	{
		System.out.println();
	}
	
	Student(String name, int algebra, int science, int history)
	{
		
		int sum = algebra + science + history; 
		int average = sum/3;
		System.out.println("The average grade for " + name + " is " + average);
	}
	

}
