package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_MultiSelectedListBox_getSelected
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/dhira/Desktop/HTML/Listbox.html");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='multiple-select']"));
		
		
		Select s = new Select(ele);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		
		System.out.println(s.getFirstSelectedOption().getText());
}
}