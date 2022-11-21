package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
//Ask the users about their country and print the language they speak
		
	Scanner scan = new Scanner (System.in);
	
	String country;
	
	//escape character : \: \" \n |t 
	//System.out.println("Where are \"you\" from?");
//prints Where are "you" from?
	
	//System.out.println("Where are \n you from?");// Where are 
	                                             //you from?
		
	//System.out.println("Where are \t you from?");//Where are 	 you from?
		
		
	System.out.println("Where are you from");
		country = scan.next();
		
		//if and else if example: 
		//to compare String statement we use .equals
		if (country.equals("Albania"))
				{
			System.out.println("You speak Albanian");
				}
		
		else if (country.equals("Turkye"))
				{
			System.out.println("You speak Turkish");
				}
		else if (country.equals("Edcuardo") || country.equals("Colombia"))
		{
		System.out.println("You speak Spanish");
		}
		
		else
		{
			System.out.println("I don't know what language you speak");
		}
		
		
		//same task using SWITCH
		
		switch(country)//everything goes into the same {}
		{
		case "Turkey":
			System.out.println("You speak Turkish");
			break;
			
		case "Albania":
		case "Kosovo":
		System.out.println("You speak Albanian");
		break;
		
		case "Spain":
		case "Ecuador":
			System.out.println("You speak Spanish");
			break;	

		case "Moldova":
			System.out.println("You speak Romaian");
			break;
			
		case "USA":
		case "UK":
			System.out.println("You speak English");
			break;
		default:
			System.out.println("I don't know what language you speak!");
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		

	}

}
