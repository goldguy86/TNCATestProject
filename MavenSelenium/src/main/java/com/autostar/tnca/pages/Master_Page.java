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
	
	@FindBy(xpath="//a[@title='Go to Homepage']") WebElement MasterPageName;
	

public void verifyLoginSuccessful()
{
	assertEquals(getText(MasterPageName), "TNC Accelerator");
	
	}
	
}
