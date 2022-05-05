package POM_With_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePahe3 
{


	@FindBy(xpath="//span[@class='user-id']") private WebElement ActPN;
	
	public KiteHomePahe3(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyName() 
	{
		String ActName = ActPN.getText();
		return ActName;
	}
	
	
}
