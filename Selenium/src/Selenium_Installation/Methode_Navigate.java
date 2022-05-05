package Selenium_Installation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Methode_Navigate 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}
}
