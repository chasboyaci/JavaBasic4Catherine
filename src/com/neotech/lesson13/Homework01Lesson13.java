package com.neotech.lesson13;

public class Homework01Lesson13 {

	public static void main(String[] args) {
		
		/*
		 * Homework 1: Create an array of countries: north America countries, south
		 * America countries, Europe countries, Asian countries, African countries. Then
		 * print all values from that array using 2 different loops and calculate how
		 * many total countries been stored.
		 */
		
		
		String[][] countries = {
				{"Mexico", "Canada", "USA"},
				{"Colombia", "Venezuela", "Ecuardo", "Brazil"},
				{"Italy", "Spain", "France"},
				{"Japan", "Thailand", "China", "Philippines"},
				{"Egypt", "Nigeria", "South Africa"}
		};
		
		for (int row = 0; row < countries.length; row++)
		{
			for(int elements = 0; elements < countries[row].length; elements++ )
			{
				System.out.print(countries[row][elements] + " ");
				
			}System.out.println();
			
		}
		
		System.out.println("-------------------------------------------------------------");
		
		
		for (String[] row : countries)
		{
			for(String country : row)
			{
				System.out.print(country + " ");
				
			}System.out.println();
		}
		
		
		
		
		

	}

}
