package com.neotech.lesson21;

public class PianoTeacher extends Teacher {

	
	boolean ownApiano;
	
	//methods
	public void playsPiano()
	{
		System.out.println(fullName + " plays the piano very well");
		System.out.println(fullName + " owns a piano:" + ownApiano);
	}
	
	
	public static void main(String[] args) {
		//create an object
		PianoTeacher pt = new PianoTeacher();
		pt.fullName = "Fazil Say";
		pt.major = "Music";
		pt.gender = 'M';
		pt.ownApiano = true;
		
		
		//call methods
		pt.teach();
		
		
	}
}
