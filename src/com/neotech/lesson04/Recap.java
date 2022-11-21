package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
//Declaring and assigning a value to a variable
		String str= "Good Morning";
				 
		System.out.println("Good Morning");
		//or
		System.out.println(str); //using String to have the ability to re-assign
		// the value
		
//re-assign a value to the previously declared variable
		str = "Good Afternoon";
		
		System.out.println("Good Afternoon");
	
		String str2 = "Bye";	
		
		str2 = "Bye";
		
	//	String str = "Edison"; this will give you an error because 
		// you cannot declare another str 
		//it's called a compiler error
		
//Arithemtic operators:
// + - * % / --> applicable for numeric data types 

//The order is PEMDAS = (), *, /, +,-
		
		int num1 = 5 + 5 + 5;
		System.out.println(num1); //will print 15 
		
		int num2 = 5 + 5 * 5;
		System.out.println(num2); //will print 30. * is before +
		
		int num3 = (5+5)*5;
		System.out.println(num3); //will print 50. () is before *
		
		int num4 = 5*5 + 5/5; //will print 26. * is before /
	System.out.println(num4);
		
		int number1 = 15;
		
		int number2 = 4;
		
		int div = number1/number2; //called assignment operator
		
		System.out.println("div ->" + div); //should be 3.75 but Java will post 3 
									// because it's an int div -->3
		// adding "" is called concatenation to give context 
	
		
		double div2 = number1/number2;
		
		System.out.println(div2); //use double to print answer that includes 
									// decimal 3.0
		
		int rem = number1 % number2; // use % (modulus) to get the remainder
		
		System.out.println("rem -->" + rem);
		
		int rem2 = 19 % 6; // 19/6+3; 3*6=18; 19-18=1;
		
		int rem3 = 19 % 7; // 19/7=2; 2*7=14; 19-14=5;
		System.out.println("rem-->" + rem3);
		
		int rem4 = 347562878%5;
		
		System.out.println(rem4);
		
		int a = 10;
		int b = 20;
		String x = "Java"; // to add a space to print put a space within the "" here
		String y = "Sunday";
		boolean z = true;
		
		System.out.println(x +" "+ y); //Java Sunday
		
		System.out.println(x+y+a); //JavaSunday10
		
		System.out.println(x + z); //Javatrue
		
		System.out.println("Java"+ 10 + 5); // Java105 concatenation example to 
											// it's printing as a String
		System.out.println("Java"+ (10 + 5)); //Java15 it's adding the () first
		// and calculating instead of just printing the values
		
		System.out.println(x + y + a + b); //JavaSunday1020
		
		System.out.println(a + b + x + y ); //30JavaSunday it's adding 10+20 first
		// it's 30 instead of 1020 because the int are numbers to Java will add
		// due to it being at the beginning
		//instead of just printing the values we assigned to a & b it's calculating
		
		
		System.out.println("" + a + b + x + y ); //adding "" will print as a string
		// instead of doing addition 1020JavaSunday
		 
		System.out.println(a + (b + x) + y );//1020JavaSunday (20 * Java)
		
		System.out.println(x + y + a * b ); //JavaSunday200 10*20 is cal.first
		
		// char c1 = ''// compiler error when not putting anything in''
		
		char c2 = ' '; //no error because there's a space. It's considered a character 
		
		String emptyString = ""; //in a string it's fine to leave it empty
				//but not in a char. This is zero characters
		
		String spaceStr = " "; //Is a String, one character inside, space 
		
		//Castin in Java is a conversion of one type into another data type
		
		//2 Types of casting
		
		//1. Widening (implicit casting, automatically)
		//byte, short, int, long, float, double
		//widening happens inplicitly/auto
		//into a = 10
		//double d = a;
		//sout (d); // 10.0
				
		//2. Narrowing (explicit casting, manually) 
		//double, float, long, int, short, byte
		//narrowing, you have to do it explicitily/manually
		//double d = 7.99;
		//int n = (int) d;
		//sout(n); //7 -> 0.99 is lost 
		//---------------------------------------------------------------------
		
		
		
		
	}

}
