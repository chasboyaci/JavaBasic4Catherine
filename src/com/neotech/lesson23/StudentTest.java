package com.neotech.lesson23;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.eating();
		student.sleeping();
		student.studying();
		
		System.out.println("___________________________");
		
		NeoTechStudent neo = new NeoTechStudent();
		neo.eating();
		neo.sleeping();
		neo.studying();
		
		System.out.println("___________________________");
	
		CollegeStudent college = new CollegeStudent();
		college.eating();
		college.sleeping();
		college.studying();
		
		System.out.println("___________________________");
		
		SchoolStudent school = new SchoolStudent();
		school.eating();
		school.sleeping();
		school.studying();
		
		
		System.out.println("___________________________");
		
		Student student2= new NeoTechStudent();
		
		student2.eating();
		student2.sleeping();
		student.studying();
		

	}

}
