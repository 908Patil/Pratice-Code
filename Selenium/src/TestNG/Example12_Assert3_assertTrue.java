package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example12_Assert3_assertTrue 
{
	@Test
	public void assertTrue() 
	{
	   boolean actResult= false;	   
	   Assert.assertTrue(actResult,"Failed:actual result is false");
	}
}
