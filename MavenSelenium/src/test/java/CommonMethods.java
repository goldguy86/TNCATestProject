import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods  {
	
	WebDriver driver;
	
	public void click(String ele)
	{
		driver.findElement(By.xpath("ele")).click();
	}
	
	
	public void EnterText(WebElement ele, String data)
	{
		ele.sendKeys(data);
	}

}
