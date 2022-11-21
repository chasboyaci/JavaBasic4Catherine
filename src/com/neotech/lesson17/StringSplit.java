package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {
		
		//split()
		String sentence = " Today is Tuesday and we are learning Java";
		String[] result = sentence.split(" ");
		
		for(String word: result)
		{
			System.out.print(word + " | ");
		}
		System.out.println(); //| Today | is | Tuesday | and | we | are | learning | Java | 

		System.out.println("This sentence has " + result.length + " words!"); //This sentence has 9 words!
		
		
		
		String[] array = sentence.split("e");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "--------"); // Today is Tu--------sday and w-------- ar-------- l--------arning Java--------

		}
		System.out.println();
		
		// the e goes away because it's the breaking point. it splits it at every 'e'
		
		
		
		String list  = "1.Hakan2.Burak3.Kenan4.Deyo";
		String[] arr = list.split("[^a-zA-Z]");	
		
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i] + " "); // Hakan  Burak  Kenan  Deyo 
		}
		

		
		
		
		
	}

}
