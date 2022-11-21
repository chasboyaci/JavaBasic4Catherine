package com.neotech.lesson13;

public class Task04 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars : American, German, Korean, Italian. Then retrieve
		 * all values from that array using 2 different loops
		 */
		
		String[][]cars = {
				{"Ford", "Tesla", "Chevy"},
				{"MB", "BMW", "Audi"},
				{"Kia", "Hyundai"},
				{"Fiat", "Lambo", "Ferrari"}	
		};
		
		//USING INDEX FOR LOOP
		for(int row = 0; row < cars.length; row++)
		{
			for(int col = 0; col < cars[row].length; col++)
			{
				System.out.print(cars[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		
		for(String[] row : cars)
		{
			for(String car : row)
			{
				System.out.print(car + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("++++++++++++++++++++++++++++++++");
		//What if I want to print only the American cars
		
		for(int US = 0; US < cars[0].length; US++)
		{
			System.out.print(cars[0][US] + " ");
		}
		System.out.println();
		
		System.out.println("++++++++++++++++++++++++++++++++");
		//What if I want to print only the German cars
		
				for(int G = 0; G < cars[1].length; G++) //change the row to 1 where the German cars are stored 
				{
					System.out.print(cars[1][G] + " ");
				}
				System.out.println();
		
		

	}

}
