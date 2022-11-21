package com.neotech.lesson24;

public class WebDriver {

	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
}

class ChromeDriver extends WebDriver{
	@Override
	public void openBrowser()
	{
		System.out.println("Open Chrome Browser");
	}	
	
}

class FirefoxDriver extends WebDriver{
	
	
	@Override
	public void openBrowser()
	{
		System.out.println("Open Firefox browswer");
	}
}

class InternetExplorerDriver extends WebDriver{
	
	@Override
	public void openBrowser()
	{
		System.out.println("Open IE Browser");
	}
}