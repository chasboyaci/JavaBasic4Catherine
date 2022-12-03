package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		
		//1. where is my .properties files located?
		String filePath = "/Users/ahmetalihasboyaci/eclipse-workspace/JavaBasic4Catherine/example.properties";
		
		//2. create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);
				
		//3. to handle .properties file; we need to use Properties java class
		Properties prop = new Properties();
		
		
		//load the file: if you don't load the file the file and try to write on it,
		//everything on the file will be lost 
		prop.load(fis);
		
		prop.setProperty("phoneNumber", "123456789");
		prop.setProperty("city", "Manhattan");
		
		//to write to the file, we need a connection using FileOutputStream
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "We updated the phone number");
		
		
		

	}

}
