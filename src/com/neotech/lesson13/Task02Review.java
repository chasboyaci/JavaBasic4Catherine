package com.neotech.lesson13;

public class Task02Review {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */
		
		
		int[] [] N = {
				{3,4,5,6},
				{10,11,12,13},
				{7,8,9,10}
		};

		
		//using indexed for loop
		for(int row = 0; row < N.length; row++) // 0, 1, 2
		{
			for (int col = 0; col < N[row].length; col++)
			{
				//how do we access the elements -> N[row][col]
				if(N[row][col] % 2 == 0)
				{
					System.out.print(N[row][col] + " ");
				}
			}
		}
		
		System.out.println();
		
		
		
		//USING ENHANCED FOR LOOP
		
		
		for(int [] row : N) //loop through and get the arrays. Getting each row. Getting the index. The location [0][0]
		{
			for(int col : row)// col will take the value of each element one my one. Element is the numbers in the index/location
			{
				if(col % 2 == 0)
				{
					System.out.print(col + " ");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
