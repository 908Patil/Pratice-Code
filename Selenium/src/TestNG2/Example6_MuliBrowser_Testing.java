package TestNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example6_MuliBrowser_Testing 
{   
	@Parameters("browserName")
	@Test
	public void TC1(String browserName ) throws InterruptedException 
	{
		WebDriver driver=null;
		
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equals("Opera")) 
		{
			System.setProperty("webdriver.opera.driver", "");
			driver = new OperaDriver();
			
		}
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(4000);
		driver.close();
	}

}
