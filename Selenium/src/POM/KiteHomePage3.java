package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage3 
{

	@FindBy(xpath="//span[@class='user-id']") private WebElement ActPN;
	
	
	KiteHomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyProfileName() 
	{
		String actText = ActPN.getText();
		String ExpectedText="DV1510";
		
		if(actText.equals( ExpectedText)) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
	
		 
		
			
		
		
		
		
	
}
