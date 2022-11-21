package com.neotech.lesson15;

public class Task {
	
	/*
	 * method1: Create a method that will take 2 parameters as numbers and prints
	 * which number is larger. 
	 * 
	 * method2: Create a method that will take a number and
	 * prints whether the number is even or odd.
	 * 
	 * method3: Create a method that will
	 * say Hello in a different language based on the country that will passed when
	 * method is executed.
	 */
	
	//minimalist method:
	//1. return type (void)
	//2. in this case, two int parameters. However you don't always need it. you can leave () empty
	//3. must have a name
	void larger(int a, int b)
	{
		if (a > b)
		{
			System.out.println( a + " is larger than " + b);
		}
		else if (b > a)
		{
			System.out.println(b + " is larger than " + a);
		}
			
		else
		{
			System.out.println("Numbers are equal");
		}
	}
	
	
	public static void main(String[] args) {
		Task t = new Task();
		 
		t.larger(5, 3); //prints: 5 is larger than 3
		t.evenOrOdd(5); //prints: 5 is odd
		t.sayHello("Ecuador"); //prints: Hola 
	}
	
	/*
	 * * method2: Create a method that will take a number and prints whether the
	 * number is even or odd.
	 */
	
	void evenOrOdd (int num)
	{
	if (num % 2 == 0)
	{
		System.out.println(num + " is even");
	}
	else 
		
	{
		System.out.println(num + " is odd");
	}

}
	
	void sayHello(String country)
	{
		switch(country)
		{
		case "US":
			System.out.println("Hello");
			break;
		case "Tukiye":
			System.out.println("Merhaba");
			break;
		case "Albania":
			System.out.println("Ckemi");
			break;
		case "Ecuador":
			System.out.println("Hola");
			break;
		default:
			System.out.println("I don't know " + country);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
