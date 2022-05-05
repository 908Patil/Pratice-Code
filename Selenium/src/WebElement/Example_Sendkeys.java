package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Sendkeys 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	
	
	driver.manage().window().maximize();
	
	
	driver.get("http://www.facebook.com");
	
	WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
	UN.sendKeys("abc");
	
	Thread.sleep(3000);
	
	UN.clear();
	
	Thread.sleep(3000);
	
	UN.sendKeys("xyz");
	
	
	
	
}
}
