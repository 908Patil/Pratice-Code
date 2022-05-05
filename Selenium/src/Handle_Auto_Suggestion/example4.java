package Handle_Auto_Suggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mpsc.gov.in/");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);
	    
	WebElement mpsc = driver.findElement(By.xpath("//a[text()='Candidate Information']"));
	    
	    Actions act = new Actions(driver);
	    
	    
	act.moveToElement(mpsc).perform();	
	}
}
