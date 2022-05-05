package POM_With_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 
{

	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContinueBtn;
	
	
	public KiteLoginPage2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void setKitePIN(String pin) 
	{
		PIN.sendKeys(pin);
	}
	
	public void clickContinueBtn() 
	{
		ContinueBtn.click();
	}
	
	
}
