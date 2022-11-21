package com.neotech.lesson10;

public class NestedLoop {

	public static void main(String[] args) {

//iterate through a number 5 times

//outer loop		
		for (int i = 0; i < 5; i++) {
			// inner loop
			for (int j = 0; j < 5; j++) {
				System.out.println("i: " + i + " j: " + j);
			} // end of inner loop

		} // end of outer loop
//the outer loop will run again once the inner loop is done. Until then
// the outer loop will remain it's original value which is 0
	}

}
