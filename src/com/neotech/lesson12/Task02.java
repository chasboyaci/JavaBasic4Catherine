package com.neotech.lesson12;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */

		String[] countries = {"Colombia", "Dominican Republic", "United States of America", "Turkey"};
		String[] capitals = {"Bogota", "Santo Domingo", "Washington D.C.", "Ankara"};
		
		for(int i = 0; i < countries.length; i++)
		{
			System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
		}
		
		System.out.println("===========================================");
		
		//Using For-Each Loop
		
		for(String country : countries)
		{
			if(country.equals("Colombia"))
			{
			System.out.println("Bogota");
			} else if (country.equals("Dominican Republic"))
					{
				System.out.println("Santo Domingo");
					}
			else if (country.equals("United States of America"))
			{
				System.out.println("Washington D.C.");
			} else if (country.equals ("Turkey"))
			{
				System.out.println("Ankara");
			}
		}
		
	}

}
