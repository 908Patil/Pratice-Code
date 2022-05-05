package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2_Page 
{

	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContinueBtn;
	
	
	KiteLogin2_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterPIN() 
	{
		Pin.sendKeys("727252");
	}
	
	public void ClickOnContinueBtn() 
	{
		ContinueBtn.click();
	}
}
