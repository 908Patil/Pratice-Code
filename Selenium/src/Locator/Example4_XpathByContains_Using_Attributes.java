package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_XpathByContains_Using_Attributes 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//tagname[contains@ attributeName,'attribute value']
		
		//forgot pwd using contains
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'number')]")).sendKeys("abc");
		
	}	
}

