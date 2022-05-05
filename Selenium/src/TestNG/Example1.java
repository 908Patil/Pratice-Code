package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 
{

	@Test
	public void TC1() 
	{
		//Assert.fail();
		Reporter.log("Verify PN1", true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("Verify PN2", true);
	}
	
}
