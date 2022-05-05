package Handle_Auto_Suggestion;

public class Reverse_string 
{

	
	public static void main(String[] args) 
	{
	
		String org= "Baburao";
		String rev = "";
		
		
		for(int i=org.length()-1; i>=0; i--) 
		{
			 rev = rev+org.charAt(i);
		}
		
		System.out.println("Orginal String = "+org);
		System.out.println("Reverse string = "+rev);
		
	}
}
