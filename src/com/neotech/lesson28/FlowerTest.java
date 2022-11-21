package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
		//Store elements in an array
		Flower[] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
		
		
		//if we try, we cannot add anymore
		//flowerArray[3] = new Rose("Rose");
		
		
		//1st difference -> array is fixed in size 
		
		
		ArrayList<Flower> flowerlist = new ArrayList<>();		
		
		flowerlist.add(new Rose("Rose"));
		flowerlist.add(new Tulip("Tulip"));
		flowerlist.add(new Sunflower("Sunflower"));
		
		//using enhanced for loop
		for(Flower fl : flowerlist)
		{
			fl.bloom();
		}
		System.out.println("___________________");
		
		
		for(int i = 0; i < flowerlist.size(); i++)
		{
			//method chaining
			flowerlist.get(i).bloom();
		}
		
		
		System.out.println("___________________");
		
		Iterator<Flower> it = flowerlist.iterator();
		
		while(it.hasNext())
		{
			Flower fl = it.next(); //first iteration: Flower fl = new Rose("Rose);
			fl.bloom();
			
			//one liner
			//it.next().bloom();
		}
		
		
		
		
		
		
		
		
		
	}

}
