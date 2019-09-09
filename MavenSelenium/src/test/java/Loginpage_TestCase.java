import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginpage_TestCase extends CommonMethods {
	
	
	@FindBy(id="username") WebElement UserName;
	
	public Loginpage_TestCase()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@BeforeMethod
	public void launchURL()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newubinseafood.e-attendance.net");
	}
	
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	//@Test(priority=1)
	public void Testcase1()
	{
		
		EnterText(UserName, "Admin");
		//driver.findElement(By.id("username")).sendKeys("Admin");
		//driver.findElement(By.id("password")).sendKeys("password1");
		click("//input[@type='submit']");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		String s = driver.findElement(By.xpath("//a[@title='Go to Homepage']")).getText();
		
		assertEquals(s, "TNC Accelerator");
		
	
	}
	
	@Test(priority=2)
	public void Testcase2() 
	{
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String s = driver.findElement(By.xpath("//p[@id='error']")).getText();
		
		assertEquals(s, "Please enter login name and password.");
		
	}
	
	
	@Test(priority=3)
	public void Testcase3()
	{
		System.out.println("Testcase3");
	}

}
