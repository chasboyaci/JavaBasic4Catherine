package com.neotech.lesson08;

public class IncrementAndDecrement {

	public static void main(String[] args) {
	
		int x = 10;
		
		//reassigning the value 
		x = 11;
		
		// the next three are the same. It increased the 11 by 1 to become 14
		// another way to reassign 
		x = x + 1;

		// short hand operations
		x += 1;
		
		//increment
		x++; // the ++ increases by 1 
		
		System.out.println(x);
		
		int y = 50;
		
		y = y - 1; // 50 - 1 =49
		
		//shorthand operation
		y -= 1;  //49 - 1 = 48
		
		//decrement
		y--;  //48 - 1 = 47
		
		System.out.println(y);
		
		
	}

}
