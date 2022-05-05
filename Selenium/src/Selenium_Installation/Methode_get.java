package Selenium_Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methode_get 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://www.google.com");

	Thread.sleep(3000);  //Browser load and pause for 5000 millisecond (5 sec)
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.manage().window().minimize();
	
	
	
}
	
	
}
