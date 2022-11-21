package com.neotech.lesson18;

public class LocalVariables {

	void method1()
	{
		//local variables are only visible within the method
		String name = "Gloria";
		int age = 28;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	void method2 ()
	{
		String name = "Mustafa";
		System.out.println(name);
		//System.out.println(age); wont print because age is in the first method in this second method
	}
	

	public static void main(String[] args) {
		
		//create an object:
		LocalVariables obj1 = new LocalVariables();
		obj1.method1();
		obj1.method2(); //it's printing at the top because it's at the start of the main method.
		//it goes in the order that it is located in the main method 
	
		
		boolean flag = true;
		
		if(flag)
		{
			String answer = "yes";
			System.out.println(answer);
			System.out.println(flag);
		}
		
		System.out.println(flag);
		//The scope/lifetime/boundary of answer is only in the if block
		//but the scope of the flag is the main method
		
		System.out.println("----------------------");
		
		for(int i = 0; i <=5; i++)
		{
			System.out.println(i);
		}
		
		//cannot access the value of "i" because it's outside of the for loop
		//System.out.println(i);
		
		System.out.println("----------------------");
		
		int x;
		
		for(x = 1; x <= 5; x++)
		{
			System.out.println(x);
		}
		
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
	}

}
