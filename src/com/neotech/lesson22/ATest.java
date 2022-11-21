package com.neotech.lesson22;

public class ATest {

	public static void main(String[] args) {
		
		
		A a = new A();
		a.method();
		System.out.println(a.name);

		C c = new C();
		c.method();
		System.out.println(c.name);		
		
		B b = new B();
		b.method();
		System.out.println(b.name);
		
	}

}
