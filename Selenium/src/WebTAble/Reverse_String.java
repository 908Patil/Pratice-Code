package WebTAble;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
	
		String act = "Maharashtra";
		String rev = " ";
		
		for(int i=act.length()-1; i>=1; i--) 
		{
			rev=rev+act.charAt(i);
		}
		
		System.out.println("Original String = "+act );
		System.out.println("Original String = "+rev );
		
	}
}
