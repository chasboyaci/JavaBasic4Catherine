package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {
		
		//We cannot instantiate abstract classes
		//we cannot create objects from abstract classes
		//Phone p = new Phone();
		//p.takePicture();
		
		Phone iphone = new iPhone(); //upcasting
		
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		iPhone iphone2 = new iPhone();
		iphone2.call();
		iphone2.text();
		iphone2.takePicture();
		iphone2.playMusic();
		
		//creating an iPhone and storing it into a Phone
		//will only have the variables and methods of the Phone
		Phone iphone3 = new iPhone();
		iphone3.call();
		iphone3.text();
		iphone3.takePicture();
		iphone3.playMusic();
		
		Phone samsung = new Samsung(); //can't use new Phone() because it's abstract class
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
		
		//samsung.googlePlay(); //can't call this because it's only in the Samsung class not in the parent/Phone class
		//because Samsung is acting like a phone 
	}
}
