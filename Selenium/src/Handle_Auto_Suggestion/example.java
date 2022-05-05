package Handle_Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example 
{

	
	public static void main(String[]args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Redmi");
		
		Thread.sleep(2000);
		
		List<WebElement> s1 = driver.findElements(By.xpath("(//ul[@class='G43f7e']/li)[6]"));
		
		String expText = "redmi 10 prime";
		
		for (WebElement options:s1) 
		{
			String actText = options.getText();
			
			if(actText.equals(expText)) 
			{
				options.click();
				break;
				
			}
			
		}
		
	}
}
