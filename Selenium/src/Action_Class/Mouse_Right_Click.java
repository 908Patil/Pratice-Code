package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_Click 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(3000);
	    
	    WebElement ebay = driver.findElement(By.xpath("//a[@title='My eBay']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(ebay).contextClick().perform();
	    
	                 //or
	    
	   // act.contextClick(ebay).perform();
	    
	    
	    
	}	    
}
