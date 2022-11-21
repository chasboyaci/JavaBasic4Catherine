package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Alex");
		ll.add("Erjola");
		ll.add(0,"Dardan");
		ll.addFirst("Murad");
		
		
		System.out.println(ll);
		System.out.println(al.size());
		
		
		//getting elements from the linkedList
		//for loop
		
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}

		System.out.println("__________________");
		
		
		//enhanced for loop
		
		for(String person: ll)
		{
			System.out.print(person + " ");
		}
		
		System.out.println("__________________");
		
		
		//iterator
		Iterator<String> it = ll.iterator();
				
				while(it.hasNext())
				{
					System.out.println();
				}
				
				
				
		
	}

}
