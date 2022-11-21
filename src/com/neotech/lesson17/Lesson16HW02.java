package com.neotech.lesson17;

public class Lesson16HW02 {

	public static void main(String[] args) {
		
	//Create a string that should a combination of letters, numbers and special characters
		//find out how many alpha characters are there in the String.
		//(alpha characters means letters)
		
		
		String str = "Hello123456@#%&%$";
		
		//[abc]
		//[a-c]
		//[^a-c] ^replace everything but a-c
		
		String str2 = str.replaceAll("[^a-zA-z]","");
		
System.out.println(str2); //Hello
		
System.out.println("How many alpha characters are there? " + str2.length()); //How many alpha characters are there? 5

//What if we want to find out how many numbers are there?

System.out.println(str.replaceAll("[^0-9]", "").length()); //6

//What if we want to find out how many special characters we have? 

System.out.println(str.replaceAll("[a-zA-Z0-9]", "").length()); //6

//typical issues
String str3 = str.replaceAll("a-z", "-"); //this is not a regex - a regular expression
String str4 =str.replaceAll("[a-z]", ""); //this might not be what you expect -- only a 





	}

}
