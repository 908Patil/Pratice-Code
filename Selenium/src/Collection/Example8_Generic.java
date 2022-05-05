package Collection;

import java.util.ArrayList;

public class Example8_Generic 
{
public static void main(String[] args) 
{
	
	
	ArrayList<String> str = new ArrayList<String>();
	
	str.add("Gaurav");
	str.add("Patil");
	str.add("Islampur");
	str.add("Sangli");
	str.add("100");
	
	for(String s1:str) 
	{
		System.out.println(s1);
	}
}
}
