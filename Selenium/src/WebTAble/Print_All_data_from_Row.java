package WebTAble;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_data_from_Row 
{

	public static void main(String[] args) 
	
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/Table.html");
		
		driver.manage().window().maximize();
		
		//for all data from header
		
	//	for(int i=1; i<=3; i++) 
	//	{
	//		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th["+i+"]")).getText();
	//		System.out.print(text);
	//	}
		
		for(int i=1; i<=3; i++) 
		{
			String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]")).getText();
			System.out.print(text+ " ");
		}
		
		
		
		
	}
}
