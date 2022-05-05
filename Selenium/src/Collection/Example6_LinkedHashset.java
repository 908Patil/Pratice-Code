package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example6_LinkedHashset 
{
public static void main(String[] args) 
{
	
  LinkedHashSet Lhs  = new LinkedHashSet();
	
	Lhs.add("Gaurav");
	Lhs.add(100);
	Lhs.add('A');
	Lhs.add(56.6f);
	Lhs.add(100);
	Lhs.add(null);
	Lhs.add(null);
	Lhs.add(100);
	Lhs.add(100);
	
	
	System.out.println(Lhs);
	
	System.out.println(Lhs.size());
	
	System.out.println(Lhs.contains(100));
	
	System.out.println("-------Remove function----------");
	Lhs.remove(56.6f);
	System.out.println(Lhs);
	
	
	System.out.println("----Print LinkedHashset info using Iterator cursor------");
	
	Iterator itr = Lhs.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
		
	
	}
		
	System.out.println("----Print LinkedHashset info using foreach loop------");
	
	for(Object s1:Lhs) 
		{
			System.out.println(s1);
		}
}
}

