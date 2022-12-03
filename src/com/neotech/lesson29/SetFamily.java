package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		
	
		
		List<String> ls = new ArrayList();
		
		ls.add("Sophie");
		ls.add("Allee");
		ls.add("Catherine");
		ls.add("Hubby");
		ls.add("Carmen");
		ls.add("Allee");
		
		System.out.println(ls);
		
		//LinkedHashSet --- no duplicates because it's a set and sets don't allow it 
		//it has insertion order
		
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.addAll(ls);
		System.out.println(lhs);
		
		//HashSet -- no duplicates, no insertion order 
		Set<String> hs = new HashSet<>(); //passing list as a constructor parameter  
		System.out.println(hs);
		
		//TreeSet --- no duplication, ascending order 
		
		Set<String> ts = new TreeSet<>();
		ts.addAll(ls);
		System.out.println(ts);

		//how do we get a specific value 
		if(lhs.contains("Catherine"))
		{
			System.out.println("Contains Catherine");
		}
		
		//we can convert sets back to list 
		List<String> list = new ArrayList<>(ts);
		//list.addAll(lhs);
		list.add("Frank");
		list.add("Ahmet");
		System.out.println(list);
		
		//can we convert set to an array 
		Object[] array = lhs.toArray();
		//Arrays
		Arrays.sort(array);
		
		//for collections we have another utility class
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
	}

}
