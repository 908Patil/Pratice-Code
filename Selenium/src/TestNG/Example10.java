package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10 
{

	@Test
	public void TC3() 
	{
		Reporter.log("Verify PN3", true);
	}
	
	@Test
	public void TC4() 
	{
		Reporter.log("Verify PN4", true);
	}
}
