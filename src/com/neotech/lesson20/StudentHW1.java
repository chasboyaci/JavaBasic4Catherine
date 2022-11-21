package com.neotech.lesson20;

public class StudentHW1 {
	
	
//Homework 1:
    //Write program as a Student class that has instance variables name and address. 
   // Create a constructor that will initialize those variables. 
   // Print name & address of given student using displayInfo method.
	
	String name; 
	String address;
	
	StudentHW1(){
		
	}
	
	
	StudentHW1 (String studentName, String studentAddress)
	{
		name = studentName;
		address = studentAddress;
	}
	
	void displayInfo()
	{
		System.out.println("The student's name is " + name + " and lives at " + address);
	}
	
	public static void main(String[] args) {
		
		StudentHW1 student1 = new StudentHW1("Catherine", "100 Jump Street");
		student1.displayInfo();
		
		
		
		
		
		
		
		
	}

}
