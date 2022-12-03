package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		//1. locate your .properties file 
			String filePath = "/Users/ahmetalihasboyaci/eclipse-workspace/JavaBasic4Catherine/example.properties";
				
				
		
		//find the user directory
			String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		
		//find user name
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//find user name
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		//lets create a dynamic path
		String dynamicFilePath = userDirectory + "/example.properties";
		System.out.println(dynamicFilePath);
		
		
		//2. create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);
			
	//3. to handle .properties file; we need to use Properties java class
		Properties prop = new Properties();
			
	//4. load everything in .properties file with load() method
		prop.load(fis);
	
		String name = prop.getProperty("name");
		System.out.println(name);
		
		System.out.println(prop.getProperty("phoneNumber"));
		
		
		
		
	}

}
