package Get_LinkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_allLinks 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://mpsconline.gov.in/candidate");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
	
	
	for(WebElement link:Alllinks) 
	{
		System.out.println(link.getText());
	}
}	
}
