package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_IsEnable 
{
public static void main(String[] args) throws InterruptedException 
{
	
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2000);
	
	
	driver.manage().window().maximize();
	
	
	driver.get("http://www.facebook.com");
	
	boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	
	System.out.println(result);
	
	if (result==true) 
	{
	
		System.out.println("Element is enable");
		
	}
	else 
	{
		System.out.println("Element is Disabled");
	}
}
	
	
}
