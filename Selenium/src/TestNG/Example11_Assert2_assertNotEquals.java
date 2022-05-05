package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example11_Assert2_assertNotEquals 
{

	@Test
	
	public void assertNotEquals() 
	{
	   String act = "Gaurav";
	   String exp = "Patil";
	   
	   Assert.assertNotEquals(act,exp,"Failed:both results sre diffrent");
	}
}
