package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Hidden_DivisionPopups 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	
	   //Enter UN
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9765088873");
	
	Thread.sleep(3000);
	
	 //Enter Pwd
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gdfshgey");
	
	Thread.sleep(3000);
	
	//Click on login button
	
	driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();;
	
	
	
	
	
	
}
}
