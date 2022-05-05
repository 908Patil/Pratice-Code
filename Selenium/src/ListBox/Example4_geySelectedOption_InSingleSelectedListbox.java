package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_geySelectedOption_InSingleSelectedListbox 
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
	   
	    WebElement month =  driver.findElement(By.xpath("//select[@title='Month']"));
	    
	    Thread.sleep(2000);
	    
	   Select s = new Select(month);
	   
	 //  WebElement selectedOption = s.getFirstSelectedOption();
	   
	 // String text = selectedOption.getText();
	   
	   // System.out.println(text);
	   
	                   //or
	   
	  // String text = s.getFirstSelectedOption().getText();
	   // System.out.println(text);
	   
	                       //or
	   
	   System.out.println(s.getFirstSelectedOption().getText());
	}
}
