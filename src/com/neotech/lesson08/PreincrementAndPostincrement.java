package com.neotech.lesson08;

public class PreincrementAndPostincrement {

	public static void main(String[] args) {

// ++ increment
// -- decrement
		
		int x;
		
		int y = 10;
		
		//POST INCREMENT - the ++ happens second x = y++
		//1. perform x = y 
		//2. increment (y = y + 1) 
		x = y++; 
		
		System.out.println(x);  //10 first x is looked and it becomes 10 x=y
								// first the assignment happens x become y value
		System.out.println(y);  //11 
		
		
		//PRE INCREMENT - the ++ is done first in a = ++b
		
		int a;
		
		int b = 15;
		
		a = ++b;
		
		System.out.println(a); //first increase ++b  then assign value of b to a
							// 15 + 1 = 16. a now becomes b. 
		
		
	//Decrement ------------------------------------------------------------	
	
		int c;
		
		int d = 14;
		
		//Pre decrement
		//first decrement (reduce by 1) the value of d 
		// second assign it to c
		c = --d; //does step 1 and 2 together
				// d -= 1 14-1 =13
				//c = d c is now 13
		
		System.out.println(c); 
		
		System.out.println(d);
		
		int e;
		int f = 14;
		
		e = f--;
		//the same as"
		//e = f
		//f= f -1 
		System.out.println(f);
		

	}

}
