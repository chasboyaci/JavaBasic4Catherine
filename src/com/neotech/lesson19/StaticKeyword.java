package com.neotech.lesson19;

public class StaticKeyword {

	
		
		//instance variables
		String color;
		int memory;
		
		//static variables
		static String brand;
		static boolean touchscreen;
		
		//not static than it's an instance method
		//inside an instance method we can use any type of variable
		void displaySpecificinfo()
		{
			System.out.println("We built a " + brand + " with " + memory + " GB with " + color + " color ");
		}
		
		
		//we get an error because memory and color are not static. They are instances
		//static void displaySpecificInfo_2() 
		//{
			//System.out.println("We built a " + brand + " with " + memory + " GB with " + color + " color ");
		//}
		
		//this static void works because brand and touchscreen are static variables
		static void displaySpecificInfo_2() 
		{
			System.out.println("Brand is " + brand  + " and the touchscreen is " + touchscreen);
		}
		
		
		public static void main(String[] args) {
			
			//this is a local variable, we have to distinguish from other variables
			//String touchscreen;
			
			//we do not have to create an object for static variables
			StaticKeyword.brand = "Iphone";
			//we are in teh same class, so we can access touchscreen without the class name. 
			// we don't need. 
			touchscreen = true; 
			
			//can we say this? No because we need an object because it's an instance variable
			//StaticKeyword.color = "red";
			
			//we need to do this: 
			StaticKeyword iphone1 = new StaticKeyword();
			
			iphone1.memory = 64;
			iphone1.color = "red";
			
			iphone1.displaySpecificinfo();
			
			
			//can we call it withoug obect name? yes because we are in the same class 
			StaticKeyword.displaySpecificInfo_2();
			
			//we can, but this is not right way to access a static method
			iphone1.displaySpecificInfo_2();
			
			//we can do this? yes, but it's not the right way to change a static variable
			iphone1.touchscreen = false;
			
			//the correct way is 
			StaticKeyword.touchscreen = true;
			
			
			//why sometimes we are using class name for static elements and sometimes not 
			//to show that we can do it from within the same class
			
			displaySpecificInfo_2();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		

	

}
