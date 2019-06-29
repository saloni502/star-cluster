package com.star.cluster.config;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.star.cluster.lib.utils.DataHandlers;

public class CreateDriver 
{
	public static WebDriver getBrowserInstance()
	{
	WebDriver driver = null;
	String browserInfo 
	= DataHandlers.getDataFromProperties("./config-data/configuration.properties","browser");
	String url
	= DataHandlers.getDataFromProperties("./config-data/configuration.properties","url");
	if(browserInfo.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./browser-server/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browserInfo.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./browser-server/geckodriver.exe");
		driver = new ChromeDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	if(url.equalsIgnoreCase("prod"))
	{
		driver.get
		(DataHandlers.getDataFromProperties("./config-data/configuration.properties","prod"));
	}
	else
	{
	driver.get
		(DataHandlers.getDataFromProperties("./config-data/configuration.properties","test"));
}
	return driver;
}
}

