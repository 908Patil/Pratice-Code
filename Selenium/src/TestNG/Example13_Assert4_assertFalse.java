package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example13_Assert4_assertFalse 
{

	@Test
	public void assertFalse() 
	{
		boolean act= false;
		Assert.assertFalse(false);
	}
}
