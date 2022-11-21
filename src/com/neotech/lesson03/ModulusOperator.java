package com.neotech.lesson03;

public class ModulusOperator {

	public static void main(String[] args) {
	
			int a = 25;
			int b = 4;
			
			int div = a/b; //6 --> lost whatever is after the decimal point
			
			//remainder -> s5/4 -> 6, remainder = 1
			
			// Modulus returns the remainder
			// "%" is the operator for modulus
			
			int remainder = a%b;
			System.out.println(div);
			System.out.println(remainder);
			
			
			//every number that is fully divisible by 2 and = 2 must be even

			//example 2 with Modulus
			//division with doubles saves the decimal
			double d1 = 3.656;
			double d2 = 4.323;
			
			double d3 = d1/d2;
			
			System.out.println(d3);
			
			int c = 13;
			int d = 5;
			
			int rem = c%d;
			//13/5 = 2 -> 2*5 = 10 ---> 13-10 = 3 
			System.out.println(rem);
			
			
			
	}

}
