package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Keyword_TimeOuts 
{

	@Test(timeOut=5000)
	public void TC1() throws InterruptedException 
	
	{
		Thread.sleep(7000);
		Reporter.log("Verify PN1", true);
	}
	
	

}
