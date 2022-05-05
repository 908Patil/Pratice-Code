package POM_With_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{

	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement Btn;
	
	
    public KiteLoginPage1(WebDriver driver) 
    {
    	PageFactory.initElements(driver,this);
    }
    
    
    public void setKiteLoginUN(String Username) 
    {
    	UN.sendKeys(Username);
    }
    
    public void setKiteLoginPWD(String Password) 
    {
    	PWD.sendKeys(Password);
    }
    
    public void clickKiteLoginBtn() 
    {
    	Btn.click();
    }
    
    
    
    
}
