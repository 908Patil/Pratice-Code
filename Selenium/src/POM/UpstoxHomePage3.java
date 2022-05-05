package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage3 
{

	@FindBy(xpath="") private WebElement ActUser;
	
	public UpstoxHomePage3 (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyUser() 
	{
		String actual = ActUser.getText();
		String Expected= "Gaurav P.";
		
		if(actual.equals(Expected)) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
	}
}
