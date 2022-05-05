package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Left_Click 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(3000);
	    
	    WebElement sell = driver.findElement(By.xpath("(//a[@class='gh-p'])[3]"));
	    
	    
	    Actions act = new Actions(driver);
	    
	   // act.moveToElement(sell).perform();
	   // act.click().perform();
	    
	                     //or
	    
	    act.click(sell).perform();
	    
	    
	    
	}
}
