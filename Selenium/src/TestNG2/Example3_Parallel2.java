package TestNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example3_Parallel2 
{

	@Test
	public void Facebook() throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://mpsconline.gov.in/candidate");
			
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			driver.close();
	}
}
