package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {
		
		//given the 1-7 then print the name of the day
		
		int day = 4;
		// when using if for all the days it makes the program look at all the 
		// the days.
		// when using else it will only look at each line until it gets to the 
		//answer 
		
		String dayName;
	
		//Example 1 using if and else if 
		if (day ==1)
		{
			System.out.println("Monday");
			
		}
				
		else if (day ==2)
		{
			System.out.println("Tuesday");
			
		}
		else if (day ==3)
		{
			System.out.println("Wednesday");
			
		}
		else if (day ==4)
		{
			System.out.println("Thursday");
			
		}
		
		else if (day ==5)
		{
			System.out.println("Friday");
			
		}
		
		else if (day ==6)
		{
			System.out.println("Saturday");
			
		}
		else if (day ==7)
		{
			System.out.println("Sunday");
			
		}
		
		else
		{
			System.out.println("Invalid day");
		}
		
		//example 2 using if and else if but with String
		// avoid having to use sysout
		if (day ==1)
		{
			
			dayName = "Monday";
		}
				
		else if (day ==2)
		{
			
			dayName = "Tuesday";
		}
		else if (day ==3)
		{
			
			dayName = "Wednesday";
		}
		else if (day ==4)
		{
			
			dayName = "Thursday";
		}
		
		else if (day ==5)
		{
			
			dayName = "Friday";
		}
		
		else if (day ==6)
		{
			
			dayName = "Saturday";
		}
		else if (day ==7)
		{
			
			dayName = "Sunday";
		}
		
		else
		{
			dayName = "Invalid";
		}
		
		//using Switch case:
		//must use {} for switch statement
		// the cases will be within the same {}
		switch(day) //we use the variable that we want to compare the value 
		{
		case 1:
			System.out.println("Monday");
			break; //end the execution or get out of switch
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;	
		case 7:
			System.out.println("Sunday");
			break;	
			
		default: // same as else if in the if - else if - else block
		System.out.println("Invalis");
			break;
		
		//In Switch the debug goes straight to the correct line instead of 
			//checking the others. 
		}

		//removing the breaks it will check all the ones before it gets to the 
		//one that matches with the variable 
		
		switch(day) //we use the variable that we want to compare the value 
		{
		case 1:
			System.out.println("Monday");
			 
		case 2:
			System.out.println("Tuesday");
			
		case 3:
			System.out.println("Wednesday");
			
		case 4:
			System.out.println("Thursday");
			
		case 5:
			System.out.println("Friday");
			
		case 6:
			System.out.println("Saturday");
				
		case 7:
			System.out.println("Sunday");
				
			
		default: // same as else if in the if - else if - else block
		System.out.println("Invalid");
			
		
		

	}
		
		switch(day) //we use the variable that we want to compare the value 
		{
		case 1:
			//System.out.println("Monday");
			 dayName = "Monday";
			 break;
		case 2:
			//System.out.println("Tuesday");
			dayName = "Tuesday";
			break;
		case 3:
			//System.out.println("Wednesday");
			dayName = "Wednesday";
			break;
		case 4:
			//System.out.println("Thursday");
			dayName = "Thursday";
			break;
		case 5:
			//System.out.println("Friday");
			dayName = "Friday";
			break;
		case 6:
			//System.out.println("Saturday");
			dayName = "Saturday";	
			break;
		case 7:
			//System.out.println("Sunday");
			dayName = "Sunday";	
			break;
			
		default: // same as else if in the if - else if - else block
		System.out.println("Invalid");
		break;
		
	}
	
}

}