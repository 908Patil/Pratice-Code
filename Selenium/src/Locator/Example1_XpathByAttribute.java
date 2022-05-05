package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1_XpathByAttribute 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	Thread.sleep(5000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//tagname[@attributeName='attribute value']
	
	//Enter UN
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("patilgaurav908");
	
	Thread.sleep(5000);
	
	//Enter PWD
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("02342258");
	
	Thread.sleep(5000);
	
	// login button
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
