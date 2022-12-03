package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, String> cities = new TreeMap<>();
		
		cities.put(1, "Ankara");
		cities.put(2, "Baku");
		cities.put(3, new String ("Tirana"));
		
		
		for(Entry<Integer,String> e : cities.entrySet())
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		//how do we deal with user objects???
		
		//let's create a map of user id and the person object
		Map<Integer, Person> people = new TreeMap<>();
		
		//create an object
		people.put(1, new Person("Murad", "Bayramov", 25, 130));
		people.put(2, new Person("Oktay", "Adatepe", 23, 120));
		people.put(3, new Person("Vugar", "", 37, 150));
		people.put(4, new Person("Sahab", "Bushaj", 45, 110));
		
		//loop through the entries and access elements
		
		for(Entry<Integer, Person> e: people.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue().name + " " + e.getValue().lastName);
			
			e.getValue().printDetails();
		}
		
	}

}
