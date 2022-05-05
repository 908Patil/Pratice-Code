package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_ListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shaadi.com/lets-begin/tvc2?msclkid=7b4fbc81a9601287f715dd1534213f08");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		WebElement Sel = driver.findElement(By.xpath("(//span[text()='Select'])[2]"));
		
		Select s = new Select(Sel);
		
		s.selectByIndex(2);
	}		
}
