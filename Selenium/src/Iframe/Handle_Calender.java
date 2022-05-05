package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Calender 
{

	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		while(true) {
		String Monthtitle = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(Monthtitle);
		if(!Monthtitle.equalsIgnoreCase("june 2021")) 
		{
			driver.findElement(By.xpath("ui-icon ui-icon-circle-triangle-w")).click();
		}
		else 
		{
			break;
		}
		
		
					
		int no = 18;
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+no+"']")).click();
		
	}
	}
}
