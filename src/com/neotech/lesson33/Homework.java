package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework {

	public static void main(String[] args) throws IOException {
		
	
		
		
		//1. create a path to the file
		
		//we could use this but when sharing it with others it wont work for them
		//String path = "/Users/ahmetalihasboyaci/eclipse-workspace/JavaBasic4Catherine/src/com/neotech/lesson33/Homework.java";
		
		//to avoid file location issues
		//user.dir shows the path of the file 
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath); ///Users/ahmetalihasboyaci/eclipse-workspace/JavaBasic4Catherine
		
		
		String fullPath = projectPath + "/configs/homework";
		System.out.println(fullPath); ///Users/ahmetalihasboyaci/eclipse-workspace/JavaBasic4Catherine/configs/homework
		
		//2. create an object to read data (FileInputStream)
		FileInputStream fis = new FileInputStream(fullPath); //at first there will be an error. Right click and select "add throw"
		
		//3. load the data from the stream
		Properties p = new Properties();
		p.load(fis); //right click and select "add throw declaration"
		
		
		//what is inside the object
		System.out.println(p); //{password=VerySecretPassword, browser=firefox, url=www.neotechacademy.com, username=Admin}
		
		//get parameters individually
		String browser = p.getProperty("browser");
		System.out.println(browser); //firefox
		
		
		String browser2 = p.getProperty("BROWSER");
		System.out.println(browser2); // null because it's case sensitive 
		
		//how do I get all the values
		Set<Object> keys = p.keySet();
		
		for (Object o : keys)
		{
			System.out.println(o + " ===> " + p.get(o));
		}
		
		//The for enhanced loop prints. Not is the same order as the file because it's a hashtable 
				//password ===> VerySecretPassword
				//browser ===> firefox
				//url ===> www.neotechacademy.com
				//username ===> Admin
		
		
		System.out.println("-----Selenium Steps------");
		System.out.println("I am opening the browser: " + p.getProperty("browser"));
		System.out.println("I navigate to this page:" + p.getProperty("url"));
		System.out.println("I will enter the username: " + p.getProperty("username"));
		System.out.println("I will enter the password: " + p.getProperty("password"));
		
		//how do we write??
		///1. created a new property
		p.setProperty("phonenumber", "837465950");
		
		//2. we need an output stream to the file 
		FileOutputStream fos = new FileOutputStream(projectPath + "/configs/homework2");
		
		//3. Store the properties object into a file 
		p.store(fos, "Added a new property");
		
	}

}
