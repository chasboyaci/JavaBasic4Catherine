package com.neotech.lesson09;

public class Task {

	public static void main(String[] args) {
	//Print numbers from 1 to 100 in 1 line with spaces
		
		for (int num = 1; num <=100; num++)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
//---------------------------------------------------------------		
		//Print numbers from 100 to 1 
		
		for (int num2 = 100; num2 >=1; num2--)
		{
			System.out.print(num2 + " ");
		}
		System.out.println();
//----------------------------------------------------------------		
		//Print even numbers from 20 to 1 (1st way)
		
		for (int num3 = 20; num3 >=1; num3--)
		{
			if (num3 % 2 == 0)
			{
				System.out.print(num3 + " ");
			}
		}
		System.out.println();
//-------------------------------------------------------------------		
		//Print even numbers from 20 to 1 (2nd way)
		for (int num4 = 20; num4 >=1; num4--)
		{
			
			System.out.print(num4 + " ");
			num4--;
		}
		
		System.out.println();
		
//---------------------------------------------------------------------		
		//Print even numbers from 20 to 1 (3rd way)
		
		for (int num7 = 20; num7 >= 1; num7 -= 2)
		{
			System.out.print(num7 + " ");
		}
		
		System.out.println();
//--------------------------------------------------------------------		
		//Print odd numbers between 20 and 50 (1st way)
		
		for (int num5 = 20; num5 <=50; num5++)
		{
			if(num5 % 2 == 1)
			System.out.print(num5 + " ");
		}
		System.out.println();
		
		//--------------------------------------------------------------------		
				//Print odd numbers between 20 and 50 (2nd way)	
		
		for (int num5 = 21; num5 <=50; num5++)
		{

			System.out.print(num5 + " ");
			num5++;
		}
		System.out.println();
//--------------------------------------------------------------------		
				//Print odd numbers between 20 and 50 (3rd way)
						

		for (int num6 = 21; num6 <= 50; num6 += 2)
		{

			System.out.print(num6 + " ");
			
		}
		System.out.println();

	}

}
