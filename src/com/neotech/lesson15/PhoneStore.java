package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		
		
//object1
PhoneReview iphone = new PhoneReview();
	
//features
iphone.brand = "Apple";
iphone.color = "Red";
iphone.model= "14 Pro";
iphone.price = 2000;

//method
iphone.call();
iphone.text();
iphone.navigate();
	

//object2
PhoneReview android = new PhoneReview();

//features
android.brand = "Samsung";
android.color = "Black";
android.model= "Note 10";
android.price = 500;

//method
android.call();
android.text();
android.navigate();

//object3
PhoneReview nokia = new PhoneReview();

//features
nokia.brand = "Nokia";
nokia.color = "Blue";
nokia.model = "3310";
nokia.price = 30;

//method
nokia.call();
nokia.text();
nokia.navigate();







		
	}

}
