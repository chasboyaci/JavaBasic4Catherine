package com.neotech.lesson04;

public class RelationalEqualityOperator {

	public static void main(String[] args) {
		
		System.out.println(6 > 8); //false
		
		int a = 6;
		int b = 8; 
		
		System.out.println(a > b); //false 
		System.out.println(b > a); //true 
		
		int c = 8;
		System.out.println(c > b); //false
		
		System.out.println(c == b); // true, is c equal to b
		System.out.println(c != b); //false, is c different from b. 
		
		double d1 = 10.3;
		double d2 = 10.3;
		
		boolean result1 =d1>d2; // is d2 greater than d1? FALSE
		System.out.println(result1);
		
		boolean result2 = d1 == d2;
		System.out.println(result2); // is d1 equal to d1? TRUE 
		
		boolean result3 = d1 <= d2;//is d1 smaller or equal to d2? TRUE
		System.out.println(result3);
		
		boolean result4 = d1 >= d2;// is d1 greater or equal to d2? TRUE
		// < > ALWAYS GOES BEFORE = 
		System.out.println(result4); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
