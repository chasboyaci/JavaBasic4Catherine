package com.neotech.lesson25;

public class FileTest {

	public static void main(String[] args) {
		
		
		File file = new JavaFile();
		
		file.edit();
		file.close();
		file.open();
		
		
		File file2 = new WordFile();
		
		file2.edit();
		file2.close();
		file2.open();
		
	
		File file3 = new PdfFile();
		
		file3.edit();
		file3.close();
		file3.open();

		
		
		
	}

}
