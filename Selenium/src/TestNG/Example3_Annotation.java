package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example3_Annotation 
{
	
	@BeforeClass
	public void Openbrowser() 
	{
		Reporter.log("open browser",true);
	}
	
	@BeforeMethod
	public void LoginApp() 
	{
		Reporter.log("Login App", true);
	}
	
	@Test
	public void TC1() 
	{
		Reporter.log("Verify PN1", true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("Verify PN2", true);
	}
	
	@AfterMethod
	public void LogOUT() 
	{
		Reporter.log("Logout", true);
	}
	
	@AfterClass
	public void closebrowser() 
	{
		Reporter.log("close browser",true);
	}
	
	
}
