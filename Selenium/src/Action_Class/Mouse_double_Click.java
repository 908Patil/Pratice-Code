package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_double_Click 
{

	public static void main(String[] args) throws InterruptedException 
	{
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(3000);
	    
	    WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    
	    
	    Actions act = new Actions(driver);
	    
	   // act.moveToElement(button).perform();
	   // act.doubleClick().perform();
	    
	                  //or
	    
	   act.doubleClick(button).perform();
	    
	}
}
