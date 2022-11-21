package com.neotech.lesson14;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		//Include the main method because we will be printing from
		// the blueprint/Student Class
	
		//s1 is a type of student
	Student s1 = new Student(); // this connects to the blueprint/Student class
	Student s2 = new Student();
	Student s3 = new Student();
		
	s1.firstName = "Vane";
	s1.lastName = "Acuna";
	s1.school = "NeoTech";
	s1.studentId = 1;
	s1.grade = 'A';
	s1.gender = 'F';
	
	s1.dohomework();
	s1.study();
	
	System.out.println("______________________________________");
	
	s2.firstName = "Murat";
	s2.lastName = "Tosun";
	s2.school = "NeoTech Academy";
	s2.studentId = 2;
	s2.grade = 'A';
	s2.gender = 'M';
	
	s2.dohomework();
	s2.study();
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
