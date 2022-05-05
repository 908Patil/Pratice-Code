package WebTAble;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_dataFrom_Particular_Index 
{

	public static void main(String[] args) 
	{
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/Table.html");
		
		driver.manage().window().maximize();
		
		//For Header 
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		
		System.out.println(text);
		
		//for particular row index data
		
		//String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[2]")).getText();
		//System.out.println(text);
		
		
	}
}
