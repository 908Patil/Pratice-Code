package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_AlertPopus 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	Thread.sleep(3000);
	
	       //Enter Customer ID
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("gthfderty");
	
	Thread.sleep(3000);
	
	      //Click on Submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Thread.sleep(3000);
	
	      //switch to alert popup
	
	Alert alt = driver.switchTo().alert();
	
	     //Get text from alert popup
	
	String text = alt.getText();
	System.out.println(text);
	
	   //click on cancel button
	
	//alt.dismiss();
	
	  //click on ok button
	
	alt.accept();
	Thread.sleep(3000);
	alt.accept();
	
	
	
	
	
}
	
	
}
