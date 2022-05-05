package Customize_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
				

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/dhira/Desktop/HTML/Customize%20ListBox.html");
		
		Thread.sleep(2000);

		//step1
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		//step2:
		Actions act=new Actions(driver);
		
		//step3:
		act.click(selectCountry).perform();
		
		Thread.sleep(1000);
		//step4:
		//4A: Arrow down
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		//4B: Arrow Up
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		
		//4C: select option/Enter
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
