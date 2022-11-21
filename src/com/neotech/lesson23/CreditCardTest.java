package com.neotech.lesson23;


public class CreditCardTest {

	public static void main(String[] args) {
		
		CreditCard card = new CreditCard();
		card.calculate(5000);
		
		
		Visa card1 = new Visa();
		card1.calculate(10000);
		
		AX card2 = new AX();
		card2.calculate(25000);
		

	}

}
