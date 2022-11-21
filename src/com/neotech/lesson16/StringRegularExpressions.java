package com.neotech.lesson16;

public class StringRegularExpressions {

	public static void main(String[] args) {

String greeting = "Good morning";


//replace ()

String newGreeting = greeting.replace('o', 'u');
System.out.println(newGreeting); //prints: Guud murning


String otherGreeting = greeting.replace("morning","afternoon");
System.out.println(otherGreeting); //prints: Good afternoon

String lastGreeting = greeting.replace("morning", "evening");
System.out.println(lastGreeting); //prints: Good evening


//can we do this" greeting.replace(('o','u)('n','i'))
String replaceMultiple = greeting.replace('o','u').replace('n','i');
System.out.println(replaceMultiple); //Guud muriiig

//replaceAll()
String combination  ="My phone # is 406-666-0099";
System.out.println(combination);

String combination2 = combination.replaceAll("[0-9]", "*");
System.out.println(combination2); //prints: My phone # is ***-***-****

String combination3 = combination.replaceAll("[a-z]", "+");
System.out.println(combination3); //prints M+ +++++ # ++ 406-346-0358

String combination4 = combination.replaceAll("[A-Z]", "+");
System.out.println(combination4); // prints +y phone # is 406-346-0358


String combination5= combination.replaceAll("[a-zA-Z]", "+");
System.out.println(combination5); // prints ++ +++++ # ++ 406-346-0358

String combination6= combination.replaceAll("[^0-9]", "");
System.out.println(combination6); // prints 4063460358

String combination7= combination.replaceAll("[0-9a-zA-Z]", "=");
System.out.println(combination7); // prints == ===== # == ===-===-====


String combination8= combination.replaceAll("-", " ");
System.out.println(combination8); // prints My phone # is 406 346 0358


	}

}
