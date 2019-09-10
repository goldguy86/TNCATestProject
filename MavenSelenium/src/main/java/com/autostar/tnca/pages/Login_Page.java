package com.autostar.tnca.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.autostar.selenium.api.base.SeleniumBase;

public class Login_Page extends SeleniumBase {

	public Login_Page() {
		
		System.out.println("Constructor called");		
		PageFactory.initElements(driver, this);
	
	}

    @FindBy(id="username")	WebElement UserName;
	@FindBy(id="password")	WebElement Password;
	@FindBy(xpath="//input[@type='submit']")	WebElement Submit;
	@FindBy(xpath="//p[@id='error']")	WebElement errorMessage;	

	public Master_Page login() {
		
		EnterText(UserName, "Admin");
		EnterText(Password, "password1");
		click(Submit);
		System.out.println("After Sumbit");
		return new Master_Page();

	}

	public void verifyUserNameGiven() {
		EnterText(Password, "password1");
		click(Submit);
		assertEquals(getTextt(errorMessage), "Please enter Login Name");
	}
	public void verifyPasswordGiven() {
		EnterText(UserName, "Admin");
		click(Submit);
		assertEquals(getTextt(errorMessage), "Please enter Password");
	}
	
	public void verifyUserNameAndPasswordGiven() {
		click(Submit);
		assertEquals(getTextt(errorMessage), "Please enter Login name and Password.");

	}
}
