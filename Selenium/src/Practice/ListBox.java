package Practice;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox 
{

public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.worldometers.info/world-population/");
	 while(true)
	 {
     List<WebElement> e = driver.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));
    		 
    for(WebElement c: e) 
    {
    	String text = c.getText();
    	System.out.println(text);

    	
    	

    }
	 }
}
}
