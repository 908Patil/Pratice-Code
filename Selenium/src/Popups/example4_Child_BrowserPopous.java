package Popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_Child_BrowserPopous 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Click on new tab from main page
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		//Get child window id
		Set<String> allIds = driver.getWindowHandles();   //We get both main & Child Window id
		
		ArrayList<String> al = new ArrayList<String>(allIds);  //[MainPage(0)   ChildWindowId(1)
		
		//String childWindowId = al.get(1);
		
		
		//Switchto child Window
		
		driver.switchTo().window(al.get(1));
		
		//click on traning link from new tab
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		
		//switch to child to main page
		
		driver.switchTo().window(al.get(0));
		
		//click on new window from main page
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
	}
}
