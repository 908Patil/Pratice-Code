package Customize_List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_First_Option 
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
		
		Thread.sleep(2000);
		act.sendKeys(Keys.END).perform();  
		
		Thread.sleep(2000);
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

	}
}
