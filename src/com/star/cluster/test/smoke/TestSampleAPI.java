package com.star.cluster.test.smoke;

import org.testng.annotations.Test;

import com.star.cluster.config.CreateDriver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestSampleAPI 
{
	WebDriver driver;
  
  @BeforeMethod
  public void preCondition() 
  {
	driver = CreateDriver.getBrowserInstance();
  }

  @AfterMethod
  public void postCondition() 
  {
	  driver.close();
  }
  @Test
  public void testSample() 
  {
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "actiTIME-Login";
	  Assert.assertEquals(actualTitle, expectedTitle);
			  
  }
}
