package com.neotech.lesson17;

public class StringToCharArray {

	public static void main(String[] args) {
		
		//toCharArray()
		
		String sentence = "Today is Tuesday and we are learning Java!";
		
		//1st way to print
		char[] charArray = sentence.toCharArray();
		
		for(char c: charArray)
		{
			System.out.print(c+"|");
		}
		System.out.println();
		System.out.println(sentence.length());
		System.out.println(charArray.length);
		
		
		//2nd way to print
		for(int i= 0; i < sentence.length(); i++)
		{
			System.out.print(charArray[i] + "|");
		}
		System.out.println();
		
		
		//reverse
		for(int i = charArray.length-1; i>=0;i--)
		{
			System.out.print(charArray[i]); //!avaJ gninrael era ew dna yadseuT si yadoT
		}
		
		System.out.println();
		
		
		
		//homework"
		//yadoT si yadseuT dna ew era gninrael !avaJ
		
		//split than reverse 
		
		
		
		
		
		
		
		
		
		
		

	}

}
