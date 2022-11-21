package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		
		int time = 8;
		
		//similar to if structure
		while (time < 12) //it keeps to loop until it becomes false when you run
		{
			System.out.println(time);
			
			time++; // to make it false. Prints 8,9,10,11
			//once (time < 12) it will then stop
		}
		
		//How to print numbers from 20 to 30. 20 included and 30 not included
		
		int a =20;
		
		while (a < 30) //a <=29 ||example of a boolean || this is true
		{
			
			//System.out.println("Condition: " + ( a < 30));
			System.out.println(a); //prints 20-29
			a++; //makes it become false 
			
		}
		
		//how to print number 5 to 25
		int b = 5;
		
		while (b <= 25)
		{
			System.out.print(b + " "); //changed println to print to be in 1 line
			//must add increment:
			++b; //it's increment because we are printing from small to large
			
			
		}
		
		//how can we print numbers from 10 to 1? DECREMENT is the answer
		
		int c =10;
		
		while(c >= 1)
		{
			System.out.println(c + " ");
			
//--c or c-- only matters if we are doing multiple operation in one line
			c--; //decrement because we are printing from large to small
			
		}
		
	//How can I print only even numbers from 50 to 1 	
		
		int d = 50;
		
		while (d > 1) //no need to put >= because 1 is not even
{
			if (d % 2 == 0) //modulus || check if d is even
			{
				System.out.println(d + " ");
			}
			
	d--; // only print even numbers
}
		
		
		
		
		
		
	}

}
