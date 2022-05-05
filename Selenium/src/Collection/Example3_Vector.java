package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example3_Vector 
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
	System.out.println(al.get(2));  //get variable from index 2
	System.out.println(al.contains(100));
	
	System.out.println("-----Right shift Operartion------");
	
	//Add or Insert information in between Vector-->Right Shift Operartion
	
	al.add(4, 200);
	System.out.println(al);
	
	
	System.out.println("-----Left Shift operation-----");
	
	//Remove or Delete information in between Vector-->Left Shift Operation
	
	al.remove(4);
	System.out.println(al);
	
	System.out.println("----------------------");
	
	//Update or Modify information in between Vector
	al.set(3,65.35f);
	System.out.println(al);
	
	System.out.println("-----Print all info in Vector using Iterator-----");
	
	Iterator itr = al.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	
	System.out.println("-----Print all info in Vector using ListIterator-----");
	
	ListIterator Ltr =  al.listIterator();
	
	while(Ltr.hasNext()) 
	{
		System.out.println(Ltr.next());
	}
	
	System.out.println("------Print all info in Vector using Loop----");
	
	for(int i=0;i<=al.size()-1;i++) 
	{
		System.out.println(al.get(i));
	}
	
	System.out.println("------Print all info in Vector using For EachLoop----");
	
	for(Object s1:al) 
	{
		System.out.println(s1);
	}
	
	System.out.println("------Print all info in Vector using Emumeration ");
	
	Enumeration Emu = al.elements();
	
	while(Emu.hasMoreElements()) 
	{
		System.out.println(Emu.nextElement());
	}
	
	
	
}
}
