package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//Casting or Converting
		//byte -> short -> int -> long -> float -> double
		
		double d1 = 3.7; // no casting/conversion
		
		System.out.println(d1); //3.7
		
		double d2 = 6; //casting is happening because it's a whole number
		//the number is being converted into a decimal that's why it's called a
		// casting/conversion 
		
		System.out.println(d2);
		//Wideing, implicit casting, automatically
		int num1 = 5; 
		//int num2 = num1; //get the value of num1 to num2 
		
		double d3 = num1; //casting is happening
		System.out.println(d3); //5.0 
		
		//complier is complaining because cannot convert a double to int like this
		//int num2 = 6.3; need to add =(int) 6.3 to work 
		
		//Narrowing, explicit casting, manually done 
		int num2 = (int) 6.3; //I want to store it as an int 6 
		System.out.println(num2);
		
		byte b1 = (byte) 3453; //out of range of a byte so you need to add (byte)
		System.out.println(b1); // converted 3453 into a smaller size to be a byte
		//size 125
		//I tell Java, I take the responsibility of the loss of data to convert
		// it into a byte. This is called NARROWING and should be done manually
		
		
		System.out.println("---------------------");
		
		
		int i2 = 45;
		//byte b2 = i2; //I may or may not lose data
		byte b2 = (byte) i2;
		System.out.println(b2); //45 in this case I did not lose data 
		
		long l1 = 17;
		int number1 =(int)l1; //NARROW. I may lose data 
		System.out.println(number1); //17 I did not lose data 
		
		//Narrowing
		//We are trying to fit something big into a small container 
		long l2 = 847337394984L;
		int number2 = (int) l2;
		System.out.println(number2);// I did lose data 1228837672 
		
		//Widenin, implicit casting, done automatically
		//because it's a small into a large is why we don't need to specify
		// with (float) 
		int number5 = 247;
		float f1 = (float) number5; //I can specify with (float) but I don't need too 
		float f2 = number5;//even if I don't specify, it will cast/convert 
		 
		System.out.println(f1); //247.0
		System.out.println(f2); //247.0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
