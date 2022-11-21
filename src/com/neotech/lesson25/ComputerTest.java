package com.neotech.lesson25;

public class ComputerTest {

	//we will create objects
	
	public static void main(String[] args) {
		
		//calling the constructor by creating an object
		//we are having to put the brand inside of the () because it's declared that way in the Computer class
		//when we do an default constructor we can leave the () empty
		Apple app = new Apple("Apple");
		HP hp = new HP("HP", "Red");
		
		
		Computer c1 = new Dell("Dell"); //up casting
		Computer c2 = new Lenovo("Lenovo"); //up casting
		
		//arrays want objects from the same data type
		int[] array = {3,5,9,2};
		
		//one way of creating an array of computers 
		Computer[] compArray = {c1,c2};
		
		//another way of creating an array of computers 
		Computer[] compArray2 = {new Dell("Dell"), new HP("HP","Black"), new Apple("Apple")};
		
		
		
		
		for(Computer comp : compArray2) 
		{
			System.out.println("The brand is " + comp.brand);
			//call the run method
			comp.run();
			
			//what if we try to run the save() method
			//this method does not exist in the Computer class
			//comp.save();
		}
		
		//we can have arrays of specific classes
		//It has to include only instances /objects of that class
		Apple[] appleArray = {new Apple("Apple1"), new Apple("Apple2")};
		
		
		
		
	}
}
