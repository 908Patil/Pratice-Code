package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example4_Linkedlist 
{
public static void main(String[] args) 
{
	
Vector al = new Vector();
	
	
	al.add("Gaurav");
	al.add(100);
	al.add('A');
	al.add(56.6f);
	al.add(100);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println(al.get(2));  
	System.out.println(al.contains(100));
	
	System.out.println("---- Operartion------");
	
	//Add or Insert information in between Linkedlist (Index are not changed)
	
	al.add(4, 200);
	System.out.println(al);
	
	
	System.out.println("-----operation-----");
	
	//Remove or Delete information in between Linkedlist
	
	al.remove(3);
	System.out.println(al);
	
	System.out.println("----------------------");
	
	//Update or Modify information in between Linkedlist
	al.set(3,65.35f);
	System.out.println(al);
	
	System.out.println("-----Print all info in Linkedlist using Iterator-----");
	
	Iterator itr = al.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	
	System.out.println("-----Print all info in Linkedlist using ListIterator-----");
	
	ListIterator Ltr =  al.listIterator();
	
	while(Ltr.hasNext()) 
	{
		System.out.println(Ltr.next());
	}
	
	System.out.println("------Print all info in Linkedlist using for Loop----");
	
	for(int i=0;i<=al.size()-1;i++) 
	{
		System.out.println(al.get(i));
	}
	
	System.out.println("------Print all info in Linkedlist using For EachLoop----");
	
	for(Object s1:al) 
	{
		System.out.println(s1);
	}
}
}
