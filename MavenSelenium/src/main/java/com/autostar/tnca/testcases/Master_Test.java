package com.autostar.tnca.testcases;

import org.testng.annotations.Test;

import com.autostar.selenium.api.base.SeleniumBase;
import com.autostar.tnca.pages.Login_Page;
import com.autostar.tnca.pages.Master_Page;

public class Master_Test extends SeleniumBase {
	
	public static Master_Page initPageElements;

	@Test
	public void verifyDateAndTime() {
		
		initPageElements=new Master_Page();
		initPageElements.verifyDateTime();
	
	}
	
}
