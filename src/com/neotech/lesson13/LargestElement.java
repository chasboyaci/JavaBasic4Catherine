package com.neotech.lesson13;

public class LargestElement {

	public static void main(String[] args) {
	//Find the largest number in an array
		
		int [] numbers = {45, 34, 87, 33, 15, 92, -13, 55};
		
		//to find the largest number we need to compare them to each other
		//We will need to use for loop
		
		//1st way create an int to store the largest number in:
		int largest = numbers[0]; //it's starting off with the first number in the array 45 as the largest. The rest of the array will be compared to 45 to see if it's larger or not
		//if it is than the specific number that is stored in the largest int will change to the new largest number until the next loop and so on until all the numbers are compared 
		
		for(int i = 1; i < numbers.length; i++) //starting at 1 for i because we don't need to compare 45 to 45. 45 is [0]. We can put 0, it will just go through an extra loop
		{
		//compare the current largest number with the new number that the loop gives us\
			if(largest < numbers[i]) // for loop will loop to see if 45 < 34. This is no so 45 remains the largest and in the next loop it's now comparing 45 < 87. 87 is the largest
				// so no 87 is no stored in the large int and in the next loop it's comparing 87 < 33 than 87 < 15 than 87 < 92. Now 92 is in the largest int and in the next loop
				// 92 < -13 and 92 < 55. So now we are at the end of the loop and 92 ended up being the largest number 
			{
				largest = numbers[i];
			}
		}
		
		System.out.println("The largest number is: " + largest);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
