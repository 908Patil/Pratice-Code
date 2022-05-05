package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_With_DDF 
{

	public static void main(String[] args) throws IOException
	{
	
		FileInputStream file= new FileInputStream("C:\\Users\\dhira\\Desktop\\Manual Excel Sheet\\Demo Excel Sheet.xlsx");
		
		Sheet Sh = WorkbookFactory.create(file).getSheet("DDF");
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://kite.zerodha.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//Enter User id
			String ID = Sh.getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(ID);
			
			//Enter Password
			String Password = Sh.getRow(0).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
			
			//Click on login button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//Enter the PIN
			String PIN = Sh.getRow(0).getCell(2).getStringCellValue();
		     driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		     
		     //Click on Continue button
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		     
		     //Verify the user is valid
		     String actID = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
		     String ExpectedID= Sh.getRow(0).getCell(3).getStringCellValue();
		     
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
