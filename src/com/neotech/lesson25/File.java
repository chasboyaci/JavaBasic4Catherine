package com.neotech.lesson25;

//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PdfFile that 	will provide specific implementation of open 	
//behaviour: Example: to open .java file we need 	notepad++ or sublime text, to open .doc file we 	
//need Microsoft word to be installed etc



public abstract class File {

	public void edit(){
		System.out.println("We can edit a file");
	}
	
	public void close(){
		System.out.println("We can close a file");
	}
	
	public abstract void open();
	
}


class JavaFile extends File{

	@Override
	public void open() {
		
		System.out.println("to open .java file we need Eclipse");
	}
	
	
}


class WordFile extends File{

	@Override
	public void open() {
		System.out.println("Microsoft word to be installed to open word files");
		
	}
	
	
}

class PdfFile extends File{

	@Override
	public void open() {
		System.out.println("To open pdf files we need adobe");
		
	}
	
}

