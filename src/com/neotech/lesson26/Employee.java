package com.neotech.lesson26;

public class Employee {

	
	
	//Private only within the class they can be worked with 
	private String name;
	private int age;
	private double salary;
	
	
	//we define getters and setters to encapsulate 
	
	
	//to create a getter
	
	//I want to provide a method that allows users of this class to get the name
	//getter: 
	
	public String getName() {
		return name;
	}
	
	//I want to provide a method that allows users of this class to set the Name
	//setter: no return type, needs argument 
	
	public void setName(String name)
	{ 
		
		if(!name.isEmpty() && name.length() >= 3)
		{
			this.name = name;
		}
	}
	
	
	//getter for age
	
	public int getAge()
	{
		return age;
	}
	
	//setter for age
	public void getAge(int age)
	{
		this.age = age;
	}
	

	//GETTER FOR SALARY
	public double getSalary()
	{
		return salary;
	}
	
	
	
	
}
