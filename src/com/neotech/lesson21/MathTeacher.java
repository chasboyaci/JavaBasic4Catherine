package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	
	
	//create behaviors that are unique to math teachers
	
	
	boolean goodWithNumbers;
	
	public void teachesMath()
	{
		System.out.println(fullName + " teaches MATH!");
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher(); 
		mt.fullName = "Elion L.";
		mt.major = "Math";
		mt.goodWithNumbers = true;
		
		
		mt.teach();
		mt.teachesMath();
		
		
		
		
		
		
		
		
	}

}
