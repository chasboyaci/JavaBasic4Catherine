package com.neotech.lesson14;

public class PhoneFeatures {

	public static void main(String[] args) {
		
		Phone phone1= new Phone();
		Phone phone2= new Phone();
		Phone phone3= new Phone();
			
		phone1.cellphone = "Iphone13";
		phone1.color = "Space Grey";
		phone1.wirelessCharging ="does";
		phone1.battery = 40;
			
		phone1.battery();
		phone1.color();
		phone1.wirelessCharging();
		
		System.out.println("__________________________________________________");
		
		phone2.cellphone = "Android";
		phone2.color = "Black";
		phone2.wirelessCharging ="does";
		phone2.battery = 56;
				
		phone2.battery();
		phone2.color();
		phone2.wirelessCharging();

		System.out.println("__________________________________________________");
		
		phone3.cellphone = "Nokia";
		phone3.color = "White";
		phone3.wirelessCharging ="doesn't";
		phone3.battery = 35;
				
		phone3.battery();
		phone3.color();
		phone3.wirelessCharging();
		
		
		
		
		
		
		
		
	}

}
