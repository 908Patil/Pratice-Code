package POM_With_DDF_TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_With_DDF.KiteLoginPage1;

public class KiteLoginPage extends BaseClass
{
	KiteLoginPage1 login1;
	KiteLoginPage2 login2;
	KiteHomePahe3 Verify;
	 int TCID;
	
    @BeforeClass
    public void OpenBrowser() 
    {
    	initializaBrowser(); 
		login1 = new KiteLoginPage1(driver);
		login2 = new KiteLoginPage2(driver);
		 Verify= new KiteHomePahe3(driver);
		
    	    
    }
    
    @BeforeMethod
    public void loginToApp() throws EncryptedDocumentException, IOException 
    {
    	login1.setKiteLoginUN(UtilityClass.getTestNGData(0,0));
    	login1.setKiteLoginPWD(UtilityClass.getTestNGData(0,1));
    	login1.clickKiteLoginBtn();
		login2.setKitePIN(UtilityClass.getTestNGData(0,2));
		login2.clickContinueBtn();
    	
    }
    
    @Test
    public void VerifyName() throws EncryptedDocumentException, IOException 
    {
    	TCID = 100;
    	String actPN = Verify.verifyName();
    	String expPN = "abcd";  //UtilityClass.getTestNGData(0,3);
    	Assert.assertEquals(actPN, expPN);
    	
    }
    
    
    @AfterMethod
    public void logoutFromApp(ITestResult result) throws IOException 
    {
    	if(result.getStatus()==ITestResult.FAILURE) 
    	{
    		
    		UtilityClass.captureScreenshot(driver, TCID);
    	}
    	
    }
    
    @AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
	}
    
    
    
    
    
    
	
}
