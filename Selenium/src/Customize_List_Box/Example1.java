package Customize_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//Step 1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		 //Step2
		Actions act = new Actions(driver);
		
		//Step3
		act.click(month).perform();
		
		//Step4
		//4.1 Arrow UP
		
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		
		//4.2 Arrow Down
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);


		
		//4.3 Select Option or ENTER
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
	}
}
