package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");
		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		
		System.out.println(text);
}
	
}
