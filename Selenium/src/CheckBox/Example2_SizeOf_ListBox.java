package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SizeOf_ListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/Muliple%20checkbox.html");
		
		
		List<WebElement> allchecckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(allchecckbox.size());
		
	}		
}
