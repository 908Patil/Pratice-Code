package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_isSelect 
{

	public static void main (String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
		System.out.println(result);
		
		if (result==true) 
		{
			System.out.println("Radio Button Selected");
		}
		
		else 
		{
			System.out.println("Radio Button Not Selected ");
		}
	}
}
