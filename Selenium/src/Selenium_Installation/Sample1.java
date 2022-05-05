package Selenium_Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Sample1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.google.com/");
	
	

}
}
