package ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_ListBox_Alphabetical_order 
{
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://en-gb.facebook.com/");
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000); 
		
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s=new Select(month);
		
		List<WebElement> allOptions = s.getOptions();
		
		TreeSet<String> tr=new TreeSet<String>();
		
		for(WebElement option:allOptions) 
		{
			String text = option.getText();
			tr.add(text);
		}
		
		for (String s1 : tr) 
		{
			System.out.println(s1);
		}
		
		
	}		
	
}
