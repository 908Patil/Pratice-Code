package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword_InvocationCount 
{

	@Test(invocationCount=5)
	public void TC1 () 
	{
		Reporter.log("Run TC1",true);
	}
}
