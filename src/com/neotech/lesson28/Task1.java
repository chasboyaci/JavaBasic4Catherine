package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("Hello");
		words.add("water");
		words.add("sweets");
		words.add("apple");
		
		System.out.println(words.size());
		System.out.println(words);
		
		Iterator<String> iter = words.iterator();
		
		while(iter.hasNext())
		{
			String word = iter.next();
			
			if(word.endsWith("e"))
				{
				iter.remove();
			
				}
			
		}
		
			System.out.println(words);
	}

}
