package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
		
		
		
		String str = "Hello";
		
		str.concat(" World!");
		
		//reassign but not changing
		
		//str --> was pointing to some string "Hello"
		//when we concat str = str + "All; --> str is pointing to this new string
		
		str = str.concat(" World!");
		System.out.println(str);
			
		String str2 = "Hello"; //actually poinitng to the one we created earlier 
		
		//String Pool
		//Hello
		//Hello All
		
		//String str = "Hello";
		//str = str + "All";
		
		//String str2 = "Hello";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
