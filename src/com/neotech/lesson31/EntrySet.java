package com.neotech.lesson31;


import java.util.*;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, String> cities = new TreeMap<>();
		
		
		cities.put("Turkiye", "Istanbul");
		cities.put("Azerbaijan", "Baku");
		cities.put("Ecuador", "Quito");
		cities.put("Colombia", "Bogota");
		
		Set<Entry<String, String>> allEntries = cities.entrySet();
		
		System.out.println(allEntries);
		
		for(Entry<String, String> e : allEntries)
		{
			String key = e.getKey();
			String value = e.getValue();
			
			
			System.out.println(key.toUpperCase() + "----" + value.toUpperCase());
		}
		
		System.out.println("-----------------------");
		
		//we convert the map into a set to use the iterator
		//Iterator<Object>
		Iterator<Entry<String, String>> it = allEntries.iterator();
	
		while(it.hasNext())
		{
			Entry<String,String> entry = it.next();
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key.toUpperCase() + "----" + value.toUpperCase());
		}
	
	
	
	}

}
