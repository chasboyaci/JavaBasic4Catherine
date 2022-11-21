
package com.neotech.lesson13;

public class RetrievingValuesFrom2dArray {

	public static void main(String[] args) {
		
	String [] [] months = {
			{"December", "January", "February"},//row 0
			{"March", "April", "May"}, //row 1
			{"June", "July", "August"}, //row 2
			{"September", "October", "November"} //row 3
			};
	//this shows us how many rows we have	
	int rows = months.length; //it's counting 4 elements 
	
	//this shows us how many columns we have in row 1
	int cols = months[2].length; //go to length for row 1
		
	System.out.println("Number of rows are " + rows + " and number of columns for the 2nd element is " + cols);	
	
	System.out.println("-------------------------------------------------------------------------------");
	
	for(int row = 0; row < rows; row++)	//outer loop
	{
		for(int col = 0; col < cols; col++) //inner loop
		{
			//what is months[0][0]? ----> "December"
			System.out.print(months[row][col] + " ");
			
		}
		System.out.println(); 
	}
	
	System.out.println("-------------------------------------------------------------------------------");
		//numbers.length 
	// numbers[0].length --> 3 
	// numbers[1].length --> 8
	// numbers[2].length --> 1
	
	//we need a loop that goes over rows -> this will go from 0, 1, 2
		//we need a loop that goes over columns
			//we need the first iteration to go through 3 elements (max index is 2) it starts counting at 0
			//we need the second iteration to go through 8 elements (max index is 7)
			//we need the third iteration to go through 1 element (max index is 0)
	
		int[][] numbers = {
				{3,4,6},
				{5,7,3,2,6,8,4,2},
				{8}	
		};
		
		int row_size = numbers.length;
		int col_size = numbers[0].length; 
		
		
		//this has to go from 0, 1, 2 
		for (int row = 0; row < numbers.length; row++ )
		{
			for(int col = 0; col < numbers[row].length; col++)
			{
				System.out.print(numbers[row][col] + " ");
			}System.out.println();
		}	
		
		
		
		
		

	}

}
