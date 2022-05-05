package TestNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2_Parallel1 
{
  @Test
  public void KiteOpen() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		
				
		Thread.sleep(4000);
		
		driver.close();
  }
	
}
