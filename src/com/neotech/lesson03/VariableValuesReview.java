package com.neotech.lesson03;

public class VariableValuesReview {

	public static void main(String[] args) {
		
		//FORMULA:
		//Data type include byte, short, etc...   name(identifier)are: a,b,c 
		//assignment operator is the equal sign (=) value;
		/*
		 * The reason to use the different primitive is to use the correct size 
		 * depending on how big it is. 
		 * Example post office, you wouldn't use a box to send a letter 
		 */
		
		byte 	a = 5;
		short   b = 130;
		int     c = 2500;
		long    d = 123456788L;
		float   e = 2.123456f;
		double  f = 5.123456789;
		char    g = 'a';
		boolean h = true; //true or false has to be lower case 

		//next step is printing the values using System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//reassign variable values 
		// can't retype byte a = 10 to reassign variables value. instead you can 
		//enter the name and put the updated value, for example a = 15
		
		
		a = 15;
		b = 170;
		c = 450000;
		d = 350L; //you can use a lower value in long at the start in preparation for that 
		//value to include in the future 
		e = 3.12345f;
		f = 6.1234567;
		g = '$'; // you can use characters (#$%^&!) but can't have a space '# '
		h = false;
		
		//printing values again
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		

	
		
	}

}
