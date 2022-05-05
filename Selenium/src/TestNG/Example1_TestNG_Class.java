package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1_TestNG_Class 
{

	@Test
	public void m1() 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://kite.zerodha.com");
			
			driver.manage().window().maximize();
			
	}
}
