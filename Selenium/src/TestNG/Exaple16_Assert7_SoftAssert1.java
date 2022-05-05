package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Exaple16_Assert7_SoftAssert1 
{

	@Test
	public void TC1()
	{
		
		SoftAssert soft = new SoftAssert();
		String act ="Gaurav";
		String Exp = "Gaurav";
		soft.assertEquals(act, Exp,"Failed:both results sre diffrent"); //We also print message if fail
		
		
		 boolean actResult= false;	   
		 soft.assertTrue(actResult,"Failed:actual result is false");
		 
		 soft.assertAll();
		
		
		  
		

	}

}
