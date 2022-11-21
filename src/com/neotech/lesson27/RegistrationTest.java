package com.neotech.lesson27;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration r = new Registration();
		System.out.println("----email-----");
		
		
		
		
		r.setEmail("brian@fox.com");
		System.out.println("Email -> + " + r.getEmail());
		
		
		r.setEmail("unur@yahoo.com");
		System.out.println("email ->" + r.getEmail());
		
		System.out.println("----username-----");
		
		r.setUserName("abcd");
		System.out.println("username -> " + r.getUserName());
		
		r.setUserName("abcd123");
		System.out.println("username -> " + r.getUserName());
		
		System.out.println("----password-----");
		r.setPassword("123");
		System.out.println("password-> " + r.getPassword());
		
		r.setPassword("abcd123");
		System.out.println("password-> " + r.getPassword());
		
		r.setPassword("NewYork123");
		System.out.println("password-> " + r.getPassword());
	}

}
