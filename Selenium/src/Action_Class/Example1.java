package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Example1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/musical-instruments/~cs-6az8gpn392/pr?sid=ypu&collection-tab-name=Ukulele+And+Guitars&fm=neo%2Fmerchandising&iid=M_7c653b87-0c63-42d6-b029-e2912d4c5aa0_4.E7EWXIX3T1AN&ssid=pkcdncu3400000001647435758122&otracker=hp_omu_Top%2BOffers_2_4.dealCard.OMU_E7EWXIX3T1AN_4&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Top%2BOffers_NA_dealCard_cc_2_NA_view-all_4&cid=E7EWXIX3T1AN&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D5000&p%5B%5D=facets.brand%255B%255D%3DMedellin");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);
	    
	    WebElement M1 = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(M1).perform();
	    
	    driver.findElement(By.xpath(""));
	   
	
	}
}
