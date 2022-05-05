package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxMain 
{

	public static void main(String[] args) 
	{
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://login-v2.upstox.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			UpstoxLogin1_Page login1 = new UpstoxLogin1_Page(driver);
			login1.setUpstoxLoginUN();
			login1.setUpstoxLoginPWD();
			login1.clicksignBtn();
			
			
			UpstoxLogin2_Page login2 = new UpstoxLogin2_Page (driver);
			login2.setUpstoxLoginPassCode();
			
				
			
			
			
	}
}
