package com.neotech.lesson21;

public class Teacher {

	//Write a Java program called Teacher. Specify features and
	//Behavior of the Teacher class. Create 3 subclasses
	//MathTeacher, ChemistryTeacher and PianoTeacher that will
	//also have their own features and behavior. Test all 4
	//classes
	
	
	//parent class
	
	String fullName;
	char gender; 
	String major;
	int age;
	
	public void teach()
	{
		System.out.println(fullName + " is a teacher");
		System.out.println(fullName + "'s major is " + major);
	}
	
	
	
	
}
