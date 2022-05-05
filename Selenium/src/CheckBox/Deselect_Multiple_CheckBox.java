package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deselect_Multiple_CheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/Muliple%20checkbox.html");
		
		
		List<WebElement> allchecckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for( WebElement s1:allchecckbox) 
		{
			s1.click();
			
			Thread.sleep(1000);
		}
		
		for(int i=allchecckbox.size()-1; i>=0; i--) 
		{
			allchecckbox.get(i).click();
			
			Thread.sleep(1000);
			
		}
		
	}	
}
