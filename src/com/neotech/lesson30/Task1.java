package com.neotech.lesson30;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> building = new LinkedHashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "NeoTech");
		building.put(4, "Microsoft");
		building.put(5, "Yahoo");
		building.put(6, "LinkedIn");
		building.put(7, "Dell");
		
		System.out.println(building);
		
		
		//how many entries do we have 
		System.out.println("We have " + building.size() + " entries");
		
		
		//updating the company with key 4 
		building.replace(4, "Indeed");
		
		System.out.println(building);
		
		//what happens if we try to do this:
		//no error and it also does not add it to a new pair 
		building.replace(8, "Suny");
		System.out.println(building);
		
		
		//remove company on the 7th floor 
		building.remove(7);
		System.out.println(building); //printing your map
		
		
		//can we insert another entry having a duplicate key?
		
		
		//we can have duplicate values but no keys 
		
		building.put(3, "HP");
		building.put(4, "Lenovo");
		
		
		
		
	}

}
