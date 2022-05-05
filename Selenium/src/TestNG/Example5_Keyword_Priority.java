package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword_Priority 
{

	@Test(priority=1)
	public void TC1() 
	{
		Reporter.log("Verify PN1", true);
	}
	
	@Test(priority=3)
	public void TC2() 
	{
		Reporter.log("Verify PN2", true);
	}
	
	@Test(priority=2)
	public void TC3() 
	{
		Reporter.log("Verify PN3", true);
	}
	
	@Test                 //default priority = 0
	public void TC4() 
	{
		Reporter.log("Verify PN4", true);
	}


}
