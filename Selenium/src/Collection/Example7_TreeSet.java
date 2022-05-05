package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example7_TreeSet 
{
public static void main(String[] args) 
{
	
	
	TreeSet tr = new TreeSet();
	tr.add(800);
	tr.add(500);
	tr.add(900);
	tr.add(700);
	tr.add(600);
	tr.add(400);
	tr.add(200);
	tr.add(300);
	tr.add(100);
	
	System.out.println(tr);
	
	System.out.println(tr.size());
	
	System.out.println(tr.isEmpty());
	
	System.out.println(tr.contains(1000));
	
	System.out.println(tr.first());
	System.out.println(tr.last());
	
	System.out.println("---Using Pollfirst we delete first element-----");
	tr.pollFirst();
	System.out.println(tr);
	
	System.out.println("---Using PollLast we delete first element-----");
	tr.pollLast();
	System.out.println(tr);
	
	
System.out.println("----Print LinkedHashset info using Iterator cursor------");
	
	Iterator itr = tr.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
		
	
	}
		
	System.out.println("----Print LinkedHashset info using foreach loop------");
	
	for(Object s1:tr) 
		{
			System.out.println(s1);
		}
	
	
	
}
}
