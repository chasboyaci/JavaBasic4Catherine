package com.neotech.lesson22;

public class Addition {

	//method signatures:
	//return type    method name (int, int, int)
	
	
	//(int,int)
	void add(int a, int b)
	{
		System.out.println(a + b);
	}
	
	
	//method overloading by changing the number of parameters
	//(int, int, int)
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	//method overloading by changing the type of parameters
	void add(double a, double b)
	{
		
		System.out.println(a + b);
	}
	
	void add(int a, int b, double c)
	{
		System.out.println(a + b + c);
	}
	
	//we are changing both of them at the same time. (number and  type)
	void add(int a, double b, int c, double d)
	{
		System.out.println(a + b+ c);
	}
	
	//can't have the same thing(String and int) 
	//but we can do (String, int) then (int, String)
	//void add(String s, int i)
	//{
		//System.out.println("We cant add them!"); 
		
	//}
	//method overloading by changing the order of parameters
	//void add(String str, int a)
	//{
		//System.out.println("We cant add them!"); 
		
	//}
	
	void add(int a, double b)
	{
		System.out.println(a + b);
	}
	
	int add(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
