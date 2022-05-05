package ListBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example9_Screeenshot 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhira\\Desktop\\Java file\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.fr/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\dhira\\Desktop\\HTML\\ScreenShot\\abc.jpg");
		
		FileHandler.copy(src, dest);
		
	
	}
}
