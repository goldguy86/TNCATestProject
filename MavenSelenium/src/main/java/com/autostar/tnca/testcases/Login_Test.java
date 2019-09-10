package com.autostar.tnca.testcases;

import org.testng.annotations.Test;

import com.autostar.selenium.api.base.SeleniumBase;
import com.autostar.tnca.pages.Login_Page;

public class Login_Test extends SeleniumBase {
	
	public static Login_Page initPageElements;
	
	
	@Test
	public void verifyLoginSuccessfull() {
		
		initPageElements=new Login_Page();
		initPageElements.login();
	
	}

	@Test
	public void ifNoUserNameGiven() {
		
	new Login_Page().verifyUserNameGiven();
	
	}
	
	@Test
	public void ifNoPasswordGiven() {
		
	new Login_Page().verifyPasswordGiven();
	
	}
	
	@Test
	public void ifNoUserNameAndPasswordGiven() {
		
	new Login_Page().verifyUserNameAndPasswordGiven();
	
	}
	
	@Test
	public void ifInvalidUsername() {
		
	new Login_Page().verifyUserNameAndPasswordGiven();
	
	}

}

