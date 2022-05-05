package Handle_Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Samsung");
	
   Thread.sleep(3000);
   
   List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
   
   String text = alloptions.get(5).getText();
   
   System.out.println(text);
}
	
	
}
