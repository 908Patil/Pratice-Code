package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Without_DDF 
{

	public static void main(String[] args) 
	{
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://kite.zerodha.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//Enter User id
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
			
			//Enter Password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
			
			//Click on login button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//Enter the PIN
		     driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
		     
		     //Click on Continue button
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		     
		     //Verify the user is vaild
		     String actID = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
		     String ExpectedID= "DV1520";
		     
		     if(actID.equals(ExpectedID)) 
		     {
		    	 System.out.println("Pass");
		     }
		     else 
		     {
		    	 System.out.println("Fail");
		     }
	}
}
