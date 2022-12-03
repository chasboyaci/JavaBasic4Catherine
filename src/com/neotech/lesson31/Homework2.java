package com.neotech.lesson31;


import java.util.*;

public class Homework2 {

	public static void main(String[] args) {
		
		
		// map uses put instead of add 
		Map<String, String> countries = new TreeMap<>();
		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA", "DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		
		System.out.println(countries);
		
		System.out.println(countries.containsKey("Albania"));
		System.out.println(countries.containsKey("Turkiye"));
		
		
		System.out.println(countries.containsValue("Prishtina"));
		
		
		Set<String> keys = countries.keySet();
		
		System.out.println(keys);
		
		
		for(String country : keys)
		{
			System.out.print(country + " ");
		}
		 System.out.println();
		
		//2nd way
		
		for(String country : countries.keySet())
		{
			System.out.print(country + " ");
		}

		System.out.println();
		
		Collection<String> capitals = countries.values();
		
		Iterator<String> it = capitals.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//2nd way 
		Iterator<String> it2 = countries.values().iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		
		
		
		
	}

}
