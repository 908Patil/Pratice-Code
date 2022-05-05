package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(3000);
	    
	    WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    
	    WebElement dest = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[1]"));
	    
	    Actions act = new Actions(driver);
	    
	    //act.dragAndDrop(src, dest).perform();
	    
	                    //or
	    
	    act.moveToElement(src).clickAndHold().moveToElement(dest).release().perform();
	    
	}
}
