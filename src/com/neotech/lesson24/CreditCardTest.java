package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {
		
		
		CreditCard card1 = new CreditCard(4000);
		card1.calculateInterest(); 
		
		
		//Up-casting is done automatically
		CreditCard card2 = new AX(8000);
		card2.calculateInterest();
		
		CreditCard card3 = new Visa(12000);
		card3.calculateInterest();
		//card3.cashBack(); //CE, type of card3 is parent class
		
		
		System.out.println("_________________________");
		
		
		//How do I call cashBack?
		//I have to do down-casting: done manually
		Visa visaCard = (Visa)card3;
		visaCard.calculateInterest();
		visaCard.cashBack();
		
		//Visa visaCard2 = (Visa)card2; //a child class cannot be casted to another child class. Giving a run time error 
		//instead of a compiler error
		//can't change an AX to a Visa 
		
		//Visa visaCard3 = (Visa) card1;
		//credit card cannot be cast into visa
		//parent cannot be casted into child class
		
		int[] intArray = {3,5,6,20};
		String[] strArray = {"a", "b","c"};
		
		
		System.out.println("_______ Array of Credit Cards______");
		CreditCard[] cards = {card1, card2, card3};
		
		for(CreditCard cc : cards)
		{
			cc.calculateInterest();
		}
		
		System.out.println("_______________");
		
		for(int i =0; i < cards.length; i++)
		{
			CreditCard cc = cards[i];
			cc.calculateInterest();
		}
		
		
	}

}
