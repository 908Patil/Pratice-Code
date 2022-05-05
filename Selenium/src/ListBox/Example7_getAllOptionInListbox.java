package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example7_getAllOptionInListbox 
{

	public static void main(String[] args, List<WebElement> ListallOptions, Object allOptions) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		
		Select s = new Select(month);
		
	List<WebElement>allOptions1=s.getOptions();
	
	for(WebElement Option:allOptions1) 
	{
		System.out.println(Option.getText());
		
	}
	}
}
