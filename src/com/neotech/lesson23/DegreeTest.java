package com.neotech.lesson23;

public class DegreeTest {

	public static void main(String[] args) {
		
		Degree a = new Degree();
		a.getPrerequisite();
		
		Bachelors b = new Bachelors();
		b.getPrerequisite();
		
		
		
		Masters c =new Masters();
		//we are overriding. we are calling the getPrerequisite() of the Master class
		c.getPrerequisite();		
	}

}
