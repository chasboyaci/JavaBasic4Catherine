package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList <String> choco = new ArrayList<>();
		
		choco.add("Allee");
		choco.add("Ahmet");
		choco.add("Leonardo");
		choco.add("Toblerone");
		choco.add("Sophie");
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Tres Leches");
		sweets.add("ice cream");
		
		//add all elements of choco on the sweets arraylist
		
		sweets.addAll(choco);
		System.out.println("size of sweets is: " + sweets.size());
		System.out.println(sweets);
		
		
		//iterator:
		//we can loop on the list with:
			//for loops (indexed or for each)
			//while loops
			//do while loop
		
		
		
		//iterator for String objects-- to iterate the object of sweets in ArrayList
		Iterator<String> it = sweets.iterator();
		
		while(it.hasNext()) //it.hasNext() if there is any other element next
			
		{
			String element = it.next(); //gives us the next element
			System.out.print(element + " - ");
			
			if(element.equals("Allee"))
			{
				it.remove();
				
			}
		}
		System.out.println();
		System.out.println(sweets);
		
		
		
		for (String str : sweets)
		{
			System.out.println(str + " ");
			
			}
		System.out.println();
		
		//normal for loop
		//if you want to iterate backwards 
		for(int i = sweets.size(); i >=0; i--)
		{
			System.out.println(sweets.get(i) + " ");
		}
		
		System.out.println();
		
		
		
		}

}
