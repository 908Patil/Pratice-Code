package Selenium_Installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7__ID 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\dhira\\Desktop\\HTML\\ID.html");
		
		//Enter FN
		
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		//Enter LN
		
		driver.findElement(By.id("1234")).sendKeys("xyz");
	}
}
