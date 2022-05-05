package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_XpathByText1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//tagname[text()='text value']
		
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}
}
