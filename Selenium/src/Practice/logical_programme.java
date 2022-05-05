package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class logical_programme 
{

	public static void main(String[] args)
	{
       String s1 = "Gaurav Patil OK Pati GAurav OK";
       String[] ar =  s1.split(" ");
       
       HashMap<String,Integer> mp = new HashMap<String,Integer>();
       
       for(int i=0; i<=ar.length-1; i--) 
       {
    	   String s2=  ar[i];
    	   
    	   if(mp.containsKey(s2)) 
    	   {
    		   mp.put(s2, mp.get(s2)+1);
    	   }
    	   else 
    	   {
    		   mp.put(s2, 1);    	   }
    	   
       }
       
     Set<String> keys=  mp.keySet();
     for(String key:keys) 
     {
    	 
    	 System.out.println(key+": "+mp.get(key));
     }
            
		
		
	}
}
