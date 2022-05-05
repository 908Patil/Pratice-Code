package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1_Page 
{

	
	@FindBy(xpath="//input[@name='userId']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement BTN;
	
	
	public UpstoxLogin1_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	} 
	
	
	public void setUpstoxLoginUN() 
	{
		UN.sendKeys("23AQF9");
	}
	
	public void setUpstoxLoginPWD() 
	{
		PWD.sendKeys("Itkare@123");
	}
	
	public void clicksignBtn() 
	{
		BTN.click();
	}
}
