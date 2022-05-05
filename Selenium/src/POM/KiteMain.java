package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteMain 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://kite.zerodha.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		KiteLogin1_Page D = new KiteLogin1_Page(driver);
		D.enterUN();
		D.enterPWD();
		D.clickLoginButton();
		
		Thread.sleep(1000);
		
		KiteLogin2_Page K = new KiteLogin2_Page(driver);
		K.enterPIN();
		K.ClickOnContinueBtn();
		
		
		
		KiteHomePage3 S = new KiteHomePage3(driver);
		S.VerifyProfileName();
		
		
	}
}
