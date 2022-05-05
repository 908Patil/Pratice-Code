package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2_Page 
{

	
	@FindBy(xpath="//input[@id='yob']") private WebElement PassCode;
	
	
	public UpstoxLogin2_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setUpstoxLoginPassCode() 
	{
		PassCode.sendKeys("1997");
	}
	
}
