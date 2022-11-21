package com.neotech.lesson20;

public class ConstructorIntro {

	String name;
	int age;
	
	//name is exactly the same as the class name
	//there is no return type
	ConstructorIntro()
	{
		System.out.println("I am default constructor!");
	}
	
	
	
	
	public static void main(String[] args) {
	
		//object type   identifier   assignment   operator constructor
		ConstructorIntro con = new ConstructorIntro();
		
		
		con.name = "Catherine";
		con.age = 35;
		
		System.out.println(con.name + " " + con.age);
		
		
		
		

	}

}
