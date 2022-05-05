package Handle_DyanamicElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class population_count 
{

	
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.drive","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.worldometers.info/world-population/");
		
		List<WebElement> count = driver.findElements(By.xpath("//div[@class='maincounter-number']"));
		
		for(WebElement s1:count) 
		{
			
			System.out.println(s1);
		}
		
		
	}
}
