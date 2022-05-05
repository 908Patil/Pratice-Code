package Collection;

import java.util.ArrayList;

public class Example1_ArrayList 
{

	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		
	
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
		
		//Add or Insert information in between arraylist-->Right Shift Operartion
		
		al.add(4, 200);
		System.out.println(al);
		
		
		System.out.println("-----Left Shift operation-----");
		
		//Remove or Delete information in between arraylist-->Left Shift Operation
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println("----------------------");
		
		//Update or Modify information in between arraylist
		al.set(3,65.35f);
		System.out.println(al);
		
		
		
		
		
	}
}
