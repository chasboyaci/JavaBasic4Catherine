package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {
	
		//There's 4 rows and 3 column
		String[][] months = {
				{"December", "January", " February"}, //row 0 
				{"March", "April", "May"}, //row 1 
				{"June", "July", "August"}, //row 2
				{"September", "October", "November"} //row 3 
		};
		
		int rowCount = months.length; //gives the number of rows
		System.out.println("There are a total of " + rowCount + " rows");
		
		
		int lengthOfRowIndex1 = months[1].length;
		System.out.println("Row index 1 has " + lengthOfRowIndex1 + " colums");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
