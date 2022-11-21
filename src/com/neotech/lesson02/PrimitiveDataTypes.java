package com.neotech.lesson02;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		// byte means it has a basic size that equal 8 numbers that only has 1
		// or 0 00110101
		byte ahmet = 9; // the range is from -128 to 127, total of 256 diff. values
		// compiler will give an error that is more than 127
		// byte ahmet =130;

		short ahmet1 = 25; // range -32768 to 32767
		// short is 2 bytes

		// the compiler only accepts whole number for short. Decimals will give an error
		int sofie2 = 23445884; // can store large numbers
		int allee3 = 3; 
		// it can store small numbers in an int
		
		long ahmet67 = 888474473839939384L;
		//if the number is bigger than 2billion we have to use long
		//if the number is bigger than 2billion we have to use L or l at the end
		
	// to store decimals we use float or double
		float ahmet54 = 23.8757f; // you must use F or f at the end 
		
		double allee2 = 23.5334; // you don't need F at the end 
		
	System.out.println(ahmet);
	
	// to store a single character we use char to store different characters
	char var3 = 'P';
	char var4 = '%';
	char var5 = 'p';
	char var6 = ' ';  //this is a space character 
	// char var7 = 'gg'; // compiller will give an error 
	
	boolean ali  = true; // to store boolen values (true or false) and no qoutes 
	
	
	
	}	
	

}
