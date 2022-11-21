package com.neotech.lesson15;

public class MethodIntro {
	
	
	
	//does not return anything       //name            //no parameters (input)
		void greet()
		{//begin body of method
			
			System.out.println("Hello");
			System.out.println("How are you?");
			System.out.println("Bye");	
			
		}//end body of method
		
		void greet2 (String name)
		{
			System.out.println("Hello " + name);
		}
	
	

	public static void main(String[] args) {
	
//calling a method --> executing a method --> running the code of a method 	
	MethodIntro obj = new MethodIntro();
	obj.greet();
	obj.greet2("Catherine"); //because we put void greet2 (String name) in the method. We are passing a string
	obj.greet2(" ");
		
	//we can pass a String Variable
	String name ="Catherine";
	obj.greet2(name);	
		
		
		
		
		
		

	}

}
