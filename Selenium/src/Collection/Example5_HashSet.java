package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example5_HashSet 
{
public static void main(String[] args) 
{
	
	HashSet hs = new HashSet();
	
	hs.add("Gaurav");
	hs.add(100);
	hs.add('A');
	hs.add(56.6f);
	hs.add(100);
	hs.add(null);
	hs.add(null);
	hs.add(100);
	hs.add(100);
	
	
	System.out.println(hs);
	
	System.out.println(hs.size());
	
	System.out.println(hs.contains(100));
	
	System.out.println("-------Remove function----------");
	hs.remove(56.6f);
	System.out.println(hs);
	
	
	System.out.println("----Print Hashset info using Iterator cursor------");
	
	Iterator itr = hs.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
		
	System.out.println("----Print Hashset info using foreach loop------");
		
		for(Object s1:hs) 
		{
			System.out.println(s1);
		}
		
	}

}
