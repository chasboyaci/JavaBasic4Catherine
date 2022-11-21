package com.neotech.lesson25;

public class WebDriverTest {

	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.name = "Chrome";
		chrome.closeBrowser();
		chrome.openBrowser();
		chrome.takePicture();
		chrome.findElement();
		chrome.maximizeWindow();
		
		
		FireFox fireFox = new FireFox();
		fireFox.name = "FireFox";
		fireFox.closeBrowser();
		fireFox.openBrowser();
		fireFox.takePicture();
		fireFox.findElement();
		chrome.maximizeWindow();
		
		
		
		

	}

}
