package Selenium_Installation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Methode_get_URL 
{

	public static void main(String[] args) 
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL IS="+url);
	}	
}
