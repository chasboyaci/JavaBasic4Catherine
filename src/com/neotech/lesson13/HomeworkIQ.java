package com.neotech.lesson13;

public class HomeworkIQ {

	public static void main(String[] args) {
		
		/*
		 * IQ 
		 * Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 */
		
		
		int[][] num = {
				{49, 50, 87, 34},
				{26, 64, 94, 46},
				{49, 86, 32, 19},	
		};
		
		int maximum = num[0][0];
		int minimum = num[0][0];
		
				
		for(int row = 0; row < num.length; row++)	
		{
			int maximim = num[row][0];
		
			for(int col = 0; col < num[row].length; col++)
			{ 
				if(maximum < num [row][col])
				{
					maximum = num[row][col];
				}
				if(minimum > num [row][col])
				{
					minimum = num[row][col];
				}
			}
		}
		
			//int secondMax = num[0][0];
			
			//for(int num: nums)
			//{
				//if(nums[0][0] > secondMax && nums[0][0] < maximum)
				//{
					//secondMax = nums[0][0];
				//}
			//}
			
				
	
		
		System.out.println("The maximum number is: " + maximum);
		System.out.println("The minimum number is: " + minimum);
		//System.out.println("The second largest number is: " + secondMax);
		
		
		
		
		
		
		
		
		
		
	}
}
