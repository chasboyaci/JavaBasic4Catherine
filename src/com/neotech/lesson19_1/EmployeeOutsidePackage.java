package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

//this imports all the classes in package com.neotech.lesson19
//import com.neotech.lesson19.*;


public class EmployeeOutsidePackage {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		
	
		Employee.company = "Neotech";
		emp.name = "Mustafa"; //we can access because it's public
		//emp.lastName = "Kilic"; //this is protected so we can't access it outside of the package
		//emp.salary = 1234; //this is default, so we cannot access outside of the package 
		//emp.ssn = 1234; //off course, private is not visible
		
		
		//can we access methods?
		
		emp.method1(); //we can access because it's public
		//we need to make them public to have access to call them here 
		//emp.method2(); //error because it's not public
		//emp.method3(); //error because it's not public
		//emp.method4(); //error because it's not public
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
