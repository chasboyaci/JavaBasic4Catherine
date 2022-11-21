package com.neotech.lesson15;

public class Homework {
	
	/*
	 * Create a method createEmail(). Based on provided users firstName, lastName
	 * and emailType, your method should return complete email address. Example:
	 * firstName -> john 
	 * lastName -> snow 
	 * emailType -> 
	 * gmail return -> johnsnow@gmail.com
	 */
	
	
	String firstName;
	String lastName;
	String emailType;
	
	
	 String createEmail(String firstName, String lastName, String emailType)
	{
	
		return firstName + lastName + "@" + emailType + ".com";
	}
	
	
	
public static void main(String[] args) {
	
	
	Homework homework = new Homework();
	
	
	String result = homework.createEmail("Catherine", "Hasboyaci", "gmail");
	
	System.out.println(result);
	
	
}
}

