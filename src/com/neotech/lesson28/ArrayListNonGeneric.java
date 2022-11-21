package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
		
		//Generic ArrayList
		
		ArrayList<Double> al = new ArrayList<>();		
		//it's a wrapped class because we wrapped it into an object -Nonprimative 
		
		al.add(2.5);
		al.add(4.7);
		al.add(2.3);
		al.add(5.5);
		//al.add(100); //CE, this is not converted automatically to double
		//al.add("five"); //CE compiler error
		
		System.out.println(al);
		
		//replacing items in ArrayList
		al.set(1, 10.2); //10.2 is index 1. replaces 4.7 to 10.2
		//if the index is larger than the size of the ArrayList? 
		//an IndexOutOfBoundsException
		
		//compile error will show before running it 
		//runtime error will show after it's ran

		System.out.println(al);
		
		//removing an element
		al.remove(0);
		al.remove(2.5); //if you want to remove the object
		
		System.out.println(al);
		
		//get an element at the index 0?
		
		System.out.println(al.get(0));
		
		//for loop
		for(int i = 0; i < al.size(); i++)
		{
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		//for each loop
		//java automatically does auto-boxing and auto unboxing, so we can use Double or double
		for(Double d : al)
		{
			System.out.print(d + " ");
		}
		System.out.println();
		
		System.out.println("___________________________");
		
		
		//Non-generic Arraylist
		
		ArrayList al2 = new ArrayList(); //not specifying any type double or string
		
		al2.add(100); //storing an integer object
		al2.add("Hello"); //storing a String object
		al2.add('A'); //storing a character object
		al2.add(al); //storing an ArrayList object
		
		System.out.println(al2);
		
		//With genetic only One Non Primitive data type with non Generic multiple non primitive data types
		
		//retrieving all elements from non-generic Arraylist
		
		for(Object obj: al2)
		{
			System.out.print(obj + " ");
		}
		
		
		
		
	}

}

