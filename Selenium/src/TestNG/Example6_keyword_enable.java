package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6_keyword_enable
{

	@Test
	public void TC1() 
	{
		Reporter.log("Verify PN1", true);
	}
	
	@Test(enabled=false)
	public void TC2() 
	{
		Reporter.log("Verify PN2", true);
	}
	
	@Test
	public void TC3() 
	{
		Reporter.log("Verify PN3", true);
	}
}
