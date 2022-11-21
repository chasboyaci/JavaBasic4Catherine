package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		
		//1st constructor is used
		Student st1 = new Student();
		st1.displayInfo();
		
		st1.name = "Catherine";
		st1.address = "123 Main St";
		
		st1.displayInfo();
		
		System.out.println("________________________");
		
		//Using the 2nd constructor
		Student st2 = new Student("Allee" , "123 Main St");
		st2.displayInfo();
		
		System.out.println("________________________");
		
		Student st3 = new Student("Sophie");
		st3.displayInfo();
		
		
		
		

	}

}
