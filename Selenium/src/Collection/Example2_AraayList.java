package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example2_AraayList 
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
		
		
		System.out.println("-----Print Using ArrayList Iterator-----");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----Print Using ArrayList ListIterator-----");
		
		ListIterator Ltr =  al.listIterator();
		
		while(Ltr.hasNext()) 
		{
			System.out.println(Ltr.next());
		}
		
		System.out.println("------Print Using ArrayList Using Loop----");
		
		for(int i=0;i<=al.size()-1;i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("------Print Using ArrayList For EachLoop----");
		
		for(Object s1:al) 
		{
			System.out.println(s1);
		}
		
	}
}

