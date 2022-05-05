package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    
    Thread.sleep(2000);
    
    //Step 1
    
    WebElement month =  driver.findElement(By.xpath("//select[@title='Month']"));
    
    //Step 2
    
    Select s = new Select(month);
    
    //Step 3
    //Any of three can use
   // s.selectByVisibleText("Apr");
    //s.selectByIndex(3);
   //s.selectByValue("12");
    
    s.selectByIndex(3);
    
    
}
}
