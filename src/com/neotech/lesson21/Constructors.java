package com.neotech.lesson21;

public class Constructors {
	
	//1st default constructor
	public Constructors()
	{
		this(3); //this is calling the 2nd constructor. This is a nested constructor. Calling a constructor from 
		//another constructor
		// this(2,4). This is not allowed. Only allows to call one other constructor in a constructor. Can't call
		//more than one constructor.
	}

	//2nd
	public Constructors(int x)
	{
		this(2,4); //this is calling the 3rd constructor
		System.out.println("Hello 2nd constructor");
	}
	
	//3rd
	public Constructors(int x, int y)
	{
		System.out.println("Hello 3rd constructor");
	}
	
	
	public static void main(String[] args) {
		Constructors obj1 = new Constructors(3,5); //3rd constructor
		Constructors obj2= new Constructors(4); //runs the 2nd constructor
		Constructors obj3 = new Constructors(); //runs the 2nd and 3rd  constructor because the first one
		// is calling the second one and the second one is calling the 3rd one. 
		
		

	}

}
