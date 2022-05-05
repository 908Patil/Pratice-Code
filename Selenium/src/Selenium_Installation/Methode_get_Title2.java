package Selenium_Installation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Methode_get_Title2 

// Check console title and expected title is right or wrong
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	
	String ActualTitile = driver.getTitle();
	
	String ExpectedTitle = "Google";
	
	if (ActualTitile.equals(ExpectedTitle)) 
	{
	
		System.out.println("TItle is Ok");
	}
	else 
	{
	
		System.out.println("Title is not OK");
	}
	
	
	
}
}
