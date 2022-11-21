package com.neotech.lesson27;

interface WebDriver{
	
	
	void open(); //by default public and abstract 
	
	void close();
	
	String getTitle();
	
	
}


interface TakeScreenshot{
	
	void getScreenshot();

}

interface RemoteWebDriver extends WebDriver, TakeScreenshot{
	
	void navigate();
	
}

class ChromeDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Chrome driver opens");
		
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {
	System.out.println("Screenshot is taken by Chrome");
		
	}

	@Override
	public void navigate() {
	System.out.println("Navigate to a web page using Chrome");	
		
	}
	
	
	
}


class FirefoxDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Firefox driver opens");
		
	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {
	System.out.println("Screenshot is taken by Firefox");
		
	}

	@Override
	public void navigate() {
	System.out.println("Navigate to a web page using Firefox");	
		
	}
	
}

class SafariDriver implements RemoteWebDriver{

	@Override
	public void open() {
		System.out.println("Safari driver opens");
		
	}

	@Override
	public void close() {
		System.out.println("Safari driver closed");
		
	}

	@Override
	public String getTitle() {
		
		return "Neotech Academy";
	}

	@Override
	public void getScreenshot() {
	System.out.println("Screenshot is taken by Safari");
		
	}

	@Override
	public void navigate() {
	System.out.println("Navigate to a web page using Safari");	
		
	}
	
}

public class Homework2 {

	public static void main(String[] args) {
		
		//you can't create an object from an interface
		//RemoteWebDriver rwd = new RemoteWebDriver();
		
		
		ChromeDriver c = new ChromeDriver();
		c.open();
		
		
		FirefoxDriver f = new FirefoxDriver();
		f.open();
		
		SafariDriver s = new SafariDriver();
		
		
		System.out.println("-----Upcasting---");
		
		RemoteWebDriver rwd1 = c; //up-casting
		rwd1.open();
		
		RemoteWebDriver rwd2 = f;
		rwd2.open();
		
		System.out.println("Why do we need upcasting");
		ChromeDriver[] chromeArray = new ChromeDriver[3];
		FirefoxDriver[] firefoxArray = new FirefoxDriver[3];
		SafariDriver[] safariArray = new SafariDriver[3];
		
		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0] = c;
		remoteArray[1] = f;
		remoteArray[2] = s;
		
		
		
		for(RemoteWebDriver driver: remoteArray) {
			System.out.println("_______________");
			driver.open();
			driver.getScreenshot();
			System.out.println(driver.getTitle());
			driver.navigate();
			driver.close();
			
			
			
		}
		
		
		
}
	
}
