package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteMain
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file = new FileInputStream("C:\\Users\\dhira\\Desktop\\Manual Excel Sheet\\Demo Excel Sheet2.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://kite.zerodha.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			KiteLoginPage1 login1 = new KiteLoginPage1(driver);
			login1.setKiteLoginUN(sh.getRow(0).getCell(0).getStringCellValue());
			login1.setKiteLoginPWD(sh.getRow(0).getCell(1).getStringCellValue());
			login1.clickKiteLoginBtn();
			
			 KiteLoginPage2 login2 = new  KiteLoginPage2(driver);
			 login2.setKitePIN(sh.getRow(0).getCell(2).getStringCellValue());
			 login2.clickContinueBtn();
			 
			 
			 kiteHomePage3 Verify = new  kiteHomePage3(driver);
			 Verify.VerifyProfileName(sh.getRow(0).getCell(0).getStringCellValue());
			 
	}	 
	
}
