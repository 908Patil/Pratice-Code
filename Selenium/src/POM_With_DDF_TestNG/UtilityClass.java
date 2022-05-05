package POM_With_DDF_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityClass 
{

	public static String getTestNGData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\dhira\\Desktop\\Manual Excel Sheet\\Demo Excel Sheet.xlsx");
		
		 String Value = WorkbookFactory.create(file).getSheet("Sheet3").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		  return Value;
		
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException 
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Eclips storage\\Selenium\\Screenshot\\TestCaseID"+TCID+".jpg");
		
		FileHandler.copy(src, dest);
	
	}
}
