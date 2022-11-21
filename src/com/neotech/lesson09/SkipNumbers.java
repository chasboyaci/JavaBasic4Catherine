package com.neotech.lesson09;

public class SkipNumbers {

	
	public static void main(String[] args) {
		
		//print numbers from 1 to 10  ----skip 3, 6, 9 
			
			for(int i = 1; i <= 10; i++)
			{
				if (i == 3 || i == 6 || i == 9 )
				{
					continue;
				}
				
				
				System.out.println(i);
			}
			
			
			//print numbers from 20 to 30 ---- skip 23 to 28
			
			for(int a = 20; a <= 30; a++)
			{
			if (a >=23 && a <=28)
			{
				continue;
			}
				System.out.print(a + " ");
				
				
			}	
				
			}
			
}
