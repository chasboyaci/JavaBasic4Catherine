package com.neotech.lesson32;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Homework1 {

	public static void main(String[] args) {
		
	//create a map
		
		Map<String, Integer> emp = new HashMap<>();
		
		emp.put("John", 75000);
		emp.put("Jack",125000);
		emp.put("Jane", 125000);
		emp.put("Brian", 50000);
		
		//find the largest value in map 
		Collection<Integer> salaries = emp.values();
		int max = 0; 
		
		//use an enhanced for loop 
		for (int s: salaries)
		{
			if(s > max)
			{
				max = s;
			}
		}
		System.out.println("The maximum salary is: " + max);
		
		//second way
		
		int max2 = Collections.max(emp.values());
		
		System.out.println(Collections.max(emp.values()));
		
		
		//how can we find, not just the largest , but also the employee name 
		
		Iterator<Entry<String , Integer >> it = emp.entrySet().iterator();
		
		Entry<String, Integer > maxEntry = it.next();
		
		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			
			if(entry.getValue() > maxEntry.getValue())
			{
				maxEntry = entry;
			}
		}
		
		System.out.println(maxEntry.getKey() + maxEntry.getValue());
		
		
	}

}
