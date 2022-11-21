package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

//Loop through the grade array
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}

		System.out.println();

		// 2nd way: enhanced loop/ advanced for loop / for-each loop

		for (char grade : grades) {
			System.out.print(grade + ", ");
		}

		System.out.println();
		System.out.println("------------------------------");

		String[] fruits = { "Apple", "Orange", "Pear", "Peach", "Kiwi", "Watermelon" };

		// Let's print the fruits on the screen

		for (int i = 0; i < fruits.length; i++) {
			// System.out.print(fruits[i] + ", ");
			// Lets print our favorite fruit
			if (fruits[i].equals("Apple")) {
				System.out.println(fruits[i] + " is my favorite fruit");
			} else {
				System.out.println(fruits[i]);
			}
		}

		System.out.println("------------------------------");
		
		//Lets do it with the for-each loop
		
		for(String individualFruit : fruits)
		{
			if(individualFruit.equals("Watermelon"))
			{
				System.out.println(individualFruit + " is my favorite fruit");
			}
			else
			{
				System.out.println(individualFruit);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
