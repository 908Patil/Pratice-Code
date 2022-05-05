package Get_LinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SizeOF_AllLinks 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mpsconline.gov.in/candidate");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		int size = driver.findElements(By.xpath("//a")).size();
		
		System.out.println(size);
	}		
}
