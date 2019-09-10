package com.autostar.selenium.api.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBase  {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchURL() throws InterruptedException
	{
		startbrowser();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	public void startbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newubinseafood.e-attendance.net");
		//Thread.sleep(3000);	
	}
	
	
	public void click(WebElement ele)
	{
		System.out.println("Running Click Event");
		ele.click();
	}
	
	
	public void EnterText(WebElement ele, String data)
	{
		ele.sendKeys(data);
		System.out.println("Entering Text");
	}
	
	public String getTextt(WebElement ele) {
		
		System.out.println("i am called");
		return ele.getText();
	}

}
