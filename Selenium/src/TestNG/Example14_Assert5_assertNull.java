package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example14_Assert5_assertNull
{
       @Test
       public void assertNull() 
       {
    	   String act =null;
    	   Assert.assertNull(act);
       }

}
