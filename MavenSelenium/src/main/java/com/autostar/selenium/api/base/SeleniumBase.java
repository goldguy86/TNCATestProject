package com.autostar.selenium.api.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBase  {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	private String URL = "http://thangayaazhine.ddns.net";
	
	
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
		driver.manage().window().maximize();
		driver.get(URL);
		//Thread.sleep(3000);	
	}
	
	
	
	public void click(WebElement ele)
	{

		ele.click();
	}
	
	
	public void EnterText(WebElement ele, String data)
	{
		ele.sendKeys(data);
		
	}
	
	public String getTextt(WebElement ele) {
		
		return ele.getText();
	}

}
