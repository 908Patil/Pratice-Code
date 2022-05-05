package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example15_Assert6_assertNotNull 
{

	 @Test
     public void assertNotNull() 
     {
  	   String act ="Gaurav";
  	   Assert.assertNotNull(act);
     }

}
