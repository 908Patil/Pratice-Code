package Handle_DyanamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Get_RatingFrom_Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi Note 10");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String text = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println(text);
		
		
	}
}
