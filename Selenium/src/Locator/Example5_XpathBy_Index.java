package Locator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_XpathBy_Index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Click on Create New account tab
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
	       //Enter First name
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	   
	   //Enter Last Name
	   
	   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		
	   // mobile number
	   
	   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("35825998");
		
		
	}	
}
