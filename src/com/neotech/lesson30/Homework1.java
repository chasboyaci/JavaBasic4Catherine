package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {

	public static void main(String[] args) {
		
		Set<String> countries = new TreeSet<>();
		countries.add("Albania");
		countries.add("Turkiye");
		countries.add("Kosovo");
		countries.add("Spain");
		countries.add("Ecuador");
		countries.add("Azerbaijan");
		
		System.out.println(countries);
		
		for(String country: countries)
			
		{
			System.out.println(country);
		}

		//iterator
		Iterator<String> it = countries.iterator();
		while(it.hasNext()) 
		{
			String country = it.next();
			System.out.println(country);
		}
		
		for(int i=0; i< countries.size();i++)
		{
			//countries.get(i); //doesn't work because we don't have an index 
		}
		
		
	}

}
