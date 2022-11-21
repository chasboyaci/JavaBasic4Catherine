package com.neotech.lesson13;

public class RetrievingValuesUsingForEach {

	public static void main(String[] args) {
		
		String[][]animals = {
				{"cat", "dog", "bird"},
				{"tiger", "lion", "bear"},
				{"salmon", "seabass", "shrimp"}
		};
		
		
		int rows = animals.length; //how to get the number of rows
		
		//how to get the number of columns for the first row
		int first_row_cols = animals[0].length;
		int second_row_cols = animals[1].length;
		int third_row_cols = animals[2].length;
		
		//how do we get the specific value, e.g. lion
		String lion = animals[1][1];
		
	
		//how do we print all values 
		for(int row = 0; row < animals.length; row++) //goes through all rows
		{
			for(int col = 0; col < animals[row].length; col++) //goes through all cols
			{
				System.out.print(animals[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("_____________________________________________________________________");
		//USING A FOR EACH LOOP:
		
		for(String[] row : animals) //for each string array row of animals
		{
			for (String animal : row) // for each string in the current row. To print the individual animal in each column. Here you create a new variable name to print individual animal
			{
				System.out.print(animal + " ");
			}
			System.out.println();
		}
		
		//USING FOR EACH IN 2D ARRAYS:
		//first loop making the 2D into 1D (1D Array: 2d Array0
		//second (nested) for loop (String value : 1D array)
		
		
		
		//Nested
		//for()
		//{
			//for ()
			//{
				
			//}
		//}
		
		
		//if()
		//{
			//if()
			//{
				
			//}
				
		//}
		
		
		
		
		
	}

}
