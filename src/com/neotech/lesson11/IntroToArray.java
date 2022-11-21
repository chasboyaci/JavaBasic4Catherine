package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {
		
		
		//1st way
		//data type   identifier   assignment operator   value
		 int              num                =             5;
		
		  //2nd way
		 //declare
		 int num2;
		 //initialize
		 num2 = 5; 
		
		//1st way 
		int[] array1 = new int[5];
		
		//2nd way
		int[] array2;
		
		array2 = new int [8];
		
		
		//array 1 [ ][ ] [ ] [ ] [ ] 
		
		//how to we store values in array?
		array1[0] = 10;
		//array 1 [10][ ] [ ] [ ] [ ] 
		array1[1] = 15;
		//array 1 [10][15] [ ] [ ] [ ] 
		array1[2] = 20;
		//array 1 [10][15] [20] [ ] [ ] 
		array1[3] = 25;
		//array 1 [10][15] [20] [25] [ ] 
		array1[4] = 30;
		//array 1 [10][15] [20] [25] [30] 
		
		//reassigning array1 [0]
		array1[0] = 5;
		//array 1 [5][15] [20] [25] [30] 
		
		System.out.println(array1[2]);
	
		
//------------------------------------------------------------------------------------
		//Let's create a String array
		
		String[] strArray = new String[4];
		
		strArray[0] = "New York";
		strArray[1]= "New Jersey";
		strArray[2]= "Atlanta";
		strArray[3]= "Colorado";


		System.out.println("I live in " + strArray[0]);
		
//-------------------------------------------------------------------------------------		
		
		char[] letters = new char[6];
		
		letters[3] = 'C'; 
		
		letters[5] = 'A'; 
		
		letters[0] = 'B'; 
		
		letters[1] = 'X'; 
		
		System.out.println("The letter at index 5 " + letters[5]);
		//Prints:  The letter at index 5 A

		//REASSIGNING
		letters[5] = 'Y'; 
		
		System.out.println("The letter at index 5 " + letters[5]);
		//PRINTS: The letter at index 5 Y
		
		
		
		
		
		
	}

}
