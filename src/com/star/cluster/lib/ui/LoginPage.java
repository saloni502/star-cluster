package com.star.cluster.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage
{
	WebDriver driver;
	
public LoginPage(WebDriver driver)
{
	this.driver = driver;
}
public void waitForLoginPageToLoad()
{
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(getUsernameTextbox()));
	
}
public WebElement getUsernameTextbox()
{
	try
	{
		WebElement element = driver.findElement(By.name("username"));
		return element;
	}
    catch(Exception e)
	{
    	
	}
	return null;
}
public WebElement getPasswordTextbox()
{
	try
	{
		WebElement element = driver.findElement(By.name("pwd"));
		return element;
	}
    catch(Exception e)
	{
    	
	}
	return null;
}
public WebElement getLoginButton()
{
	try
	{
		WebElement element = driver.findElement(By.xpath("//input[@type ='submit']"));
		return element;
	}
    catch(Exception e)
	{
    	
	}
	return null;
}
public WebElement getLoginErrorMsg()
{
	try
	{
		WebElement element = driver.findElement(By.xpath
				("//span[text() ='Username or Password is Invalid.Please try again']"));
		return element;
	}
    catch(Exception e)
	{
    	
	}
	return null;
}
}