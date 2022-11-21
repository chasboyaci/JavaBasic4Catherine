package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
	
		Employee.company = "Neotech";
		
		Employee emp = new Employee();
	
		emp.name = "Sabah";
		emp.lastName = "Bushaj"; //within package, we can access protected elements 
		emp.salary = 23134; //within package we can access default elements because the classes are in the same package
		
		//this is not visible because it's private
		//emp.ssn = 1234;
		
		//can we access methods
		emp.method1(); //public method, so we can access it
		emp.method2(); // protected method, we can access it within package
		emp.method3(); //default method, we can access it within package
		
		//emp.method4(); // error because it's private
		
		
		
		
		
		

	}

}
