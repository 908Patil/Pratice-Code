package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example7_Keyword_dependsONMethode 
{
    @Test
	public void LoginApp() 
	{
    	Assert.fail();
		Reporter.log("Login App", true);
	}
    
    @Test(dependsOnMethods= {"LoginApp"})
   	public void Logout() 
   	{
   		Reporter.log("Logout App", true);
   	}
    
    
	

}
