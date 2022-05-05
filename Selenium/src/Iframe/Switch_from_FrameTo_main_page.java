package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_from_FrameTo_main_page 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		//Switch to frame
		
		driver.switchTo().frame("iframeResult");
		
		//Click on button
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Switch from frame to main page
		
		driver.switchTo().parentFrame();
		           //or
		//driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		
		//Click on  home icon on main page
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	}
}
