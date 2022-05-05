package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_IsDisplayed
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");
		
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		System.out.println(result);
		
		if(result==true) 
		{
			System.out.println("Element found");
			
		}
		else 
		{
			System.out.println("Element is not found");
		}
		
	}
}
