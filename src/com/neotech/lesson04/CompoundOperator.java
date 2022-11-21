package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {

		int num = 100; // store 100 into a container

		num = num + 100; // add 100 to the value inside the container
		System.out.println(num); // 200

		num = num + 100; // add 100 to the value inside the container
		System.out.println(num); // 300 because num is now 200 than 100 is added

		// or

		num += 60; // add 60 to the contanier
		System.out.println(num); // 360 this is the shortcut
		// can use the compound/shorthand operator

		// num = num - 10; //the long way
		System.out.println(num); // 350

		// short way
		num -= 10;
		System.out.println(num); // 350

		int a = 5;

		a += 2; // get the value of 5 and get 2 to =7

		// num = num / 7; This is the long way
		num /= 7; // this is the short hand way
		System.out.println(num); // 50

		// num = num * 2; long way
		num *= 2;
		System.out.println(num); // 100 short hand way

		num %= 9; //Modulus Operator. 100 mod 9 = 1
		//num = num % 9;

		System.out.println(num); // the remainder is 1
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
