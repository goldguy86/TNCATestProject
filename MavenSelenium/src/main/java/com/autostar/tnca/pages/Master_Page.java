package com.autostar.tnca.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autostar.selenium.api.base.SeleniumBase;

public class Master_Page extends SeleniumBase {
	
	public Master_Page()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Go to Homepage']") 
	WebElement MasterPageName;
	@FindBy(xpath="//p[@id='timeval']")
	WebElement FullDateAndTime;
	

public void verifyLoginSuccessful()
{
	assertEquals(getTextt(MasterPageName), "TNCHOME");
	
	}

public void verifyDateTime() 

       {
	new Login_Page().login();
	String dateAndTime = getTextt(FullDateAndTime);
	System.out.println(dateAndTime);
	System.out.println("Missing DateAndTime");
	assertEquals(dateAndTime, "TNC Accelerator");
       }
  
	
}
