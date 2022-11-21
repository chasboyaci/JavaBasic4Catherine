package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		
		ArrayList <String> words = new ArrayList<>();
		
		words.add("love");
		words.add("happy");
		words.add("home");
		words.add("dog");
		
		Iterator<String> it = words.iterator();

while(it.hasNext()) 
			
		{
			String element = it.next(); 
			System.out.print(element + "  ");
			
			if(element.endsWith("e"))
			{
				it.remove();
				
			}
		}
		System.out.println();
		System.out.println(words);
		
		
	}

}
