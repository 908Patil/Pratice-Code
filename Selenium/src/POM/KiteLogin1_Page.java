package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1_Page 
{

	//Step1:Decleration
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']")  private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")  private WebElement loginBtn;
	
	
	//Step 2:Initialization using Constructor
	
	KiteLogin1_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Step3:Usage
	
	public  void enterUN() 
	{
		UN.sendKeys("BY4454");
	}
	
	public void enterPWD() 
	{
		PWD.sendKeys("India@11");
	}
	
	public void clickLoginButton() 
	{
		loginBtn.click();
	}
	
	
	
}
