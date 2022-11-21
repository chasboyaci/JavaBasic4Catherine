package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {
		
		
		Doctor doc = new Doctor();
		
		doc.setLicenseID(345879765596l);
		System.out.println(doc.getLicenseID());
		
		//power of encapsulation 
		doc.setEmail("");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@yahoo.com");
		System.out.println(doc.getEmail());
		
		
		//only if we satisfy the set conditions we get access
		doc.setEmail("doctor.gmail.com");
		System.out.println(doc.getEmail());
		
		
		//what happens if I do this?
		
		doc.setEmail(" ");
		System.out.println("doc.gmail.com");
		
	}

}
