package com.autostar.tnca.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	@FindBy(xpath="//li[@id='usermanagement']")
	WebElement UserManagement;
	
	
	public Master_Page verifyServerDate() throws InterruptedException
	{ 
		
		wait=new WebDriverWait(driver,1);
		
	    //Get the text before performing an ajax call
	    //WebElement timeCaptured1 = driver.findElement(By.id("timeval"));
		wait.until(ExpectedConditions.visibilityOf(FullDateAndTime));
		String time1 = FullDateAndTime.getText().trim();
		System.out.println(time1);
		
		Thread.sleep(1000);
		
		/*Get the text after ajax call*/
		//WebElement timeCaptured2 = driver.findElement(By.id("timeval"));
		wait.until(ExpectedConditions.visibilityOf(FullDateAndTime));
		String time2 = FullDateAndTime.getText().trim();
		System.out.println(time2);
		
		/*Verify both texts before ajax call and after ajax call text.*/
		Assert.assertNotEquals(time1, time2);
		//System.out.println("Ajax Call Performed");
		return this;
	}
	
	
public Add_New_User_Page clickUserManagement(){
		
		click(UserManagement);
		return new Add_New_User_Page();
}
	

public void verifyLoginSuccessful()
{
	assertEquals(getTextt(MasterPageName), "TNCHOME");
	
	}

	
}
