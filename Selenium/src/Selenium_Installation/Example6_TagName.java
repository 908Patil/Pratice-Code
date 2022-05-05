package Selenium_Installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_TagName 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/tagname.html");
		
		//Enter FN
		
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//Enter LN
		
		driver.findElement(By.tagName("input")).sendKeys("xyz");
	}
}
