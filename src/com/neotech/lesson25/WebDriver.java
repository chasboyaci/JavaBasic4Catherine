package com.neotech.lesson25;

public interface WebDriver {

	

	
	abstract void openBrowser();
	
	abstract void closeBrowser();
	
	abstract void maximizeWindow();
	
	abstract void findElement();
	
	
	
}

interface Camera{
	
	abstract void takePicture();
}
	
class ChromeDriver implements WebDriver, Camera{

	String name;
	
	@Override
	public void openBrowser() {
		System.out.println("Please open " + name);
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Please close " + name);
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Please maximum " + name);
		
	}

	@Override
	public void findElement() {
		System.out.println("Please find the element of " + name);
		
	}

	@Override
	public void takePicture() {
		System.out.println("Please take a screenshoot of " + name);
		
	}
	
}
	
	
class FireFox implements WebDriver, Camera {

	String name;
	
	@Override
	public void openBrowser() {
		System.out.println("Please open " + name);
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Please close " + name);
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Please maximize " + name);
		
	}

	@Override
	public void findElement() {
		System.out.println("Please find the element of");
		
	}

	@Override
	public void takePicture() {
		System.out.println("Please take a screenshoot of " + name);
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	

