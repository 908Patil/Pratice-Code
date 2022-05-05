package Customize_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 
{

public static void main(String[] args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions act = new Actions(driver);
	
	act.click(month).perform();
	
	for(int i=1; i<=7; i++) 
	{
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
	}
	
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
}
}
