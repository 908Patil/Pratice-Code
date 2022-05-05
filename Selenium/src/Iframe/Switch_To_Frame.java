package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Frame
{
public static void main(String[] args) throws InterruptedException 
{
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	//Switch to iframe
	
	//driver.switchTo().frame(0);    //int frame index
	                             //or
	
	//driver.switchTo().frame("iframeResult");    //String frame name
	
	                            //or
	
	//driver.switchTo().frame("iframeResult");      // String frame id
	
	                            //or
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	
	
	//Click on button
	
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
}
}
