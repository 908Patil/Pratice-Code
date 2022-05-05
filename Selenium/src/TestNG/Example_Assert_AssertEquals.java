package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_Assert_AssertEquals 
{

	@Test
	public void AssertEqual()
	{
		String act ="Gaurav";
		String Exp = "Patil";
		Assert.assertEquals(act, Exp,"Failed:both results sre diffrent"); //We also print message if fail
	}
}
