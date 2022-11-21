package com.neotech.lesson23;

//Homework 2:
   // ▪ Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
   // ▪ Define common behavior within the parent class and override some of the methods in the child classes
   // ▪ Define some methods specific to the child classes
   // ▪ Write an example of achieving run time polymorphism


public class Student {

	void studying()
	{
		System.out.println("Students are studying");
	}
	
	void eating()
	{
		System.out.println("Students are eating");
	}
	
	void sleeping()
	{
		System.out.println("Students are sleeping");
	}
	
}

class NeoTechStudent extends Student
{
	@Override
	void studying()
	{
		System.out.println("NeoTech student are studying Java");
	}
	

	
}

class CollegeStudent extends Student
{ @Override
	void eating()
	{
		System.out.println("College students are eating a lot during their first year in college");
	}
	
}

class SchoolStudent extends Student
{
	@Override
	void sleeping()
	{
		System.out.println("Students are sleeping at least 8 hours a night");
	}
	
	
}