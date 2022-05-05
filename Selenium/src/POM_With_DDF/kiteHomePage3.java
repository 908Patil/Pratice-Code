package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage3 
{

@FindBy(xpath="//span[@class='user-id']") private WebElement ActPN;
	
	
    public kiteHomePage3 (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyProfileName(String ExpectedText  ) 
	{
		String actText = ActPN.getText();
				
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
	
	
