package WebTAble;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Row_Size 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/Table.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> allrowsize = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		
		int size = allrowsize.size();
		
		System.out.println(size);
		
		
	}
}
