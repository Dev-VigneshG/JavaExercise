import java.util.*;
class Mark extends Exception
{
	String m;
	Mark(String s)
	{
		m=s;
	}
	public String toString()
	{
		return m;
	}
}
class Sample93
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Internal Mark:");
		int internal=s.nextInt();
		System.out.println("Enter External Mark:");
		int external=s.nextInt();
		try
		{
			if(internal>25)
			{
				Mark m1=new Mark("Internal Mark is exceed");
				throw m1;
			}
			else if(external>75)
			{
				Mark m2=new Mark("External Mark is exceed");
				throw m2;
			}
			else{
			int tot=internal+external;
			System.out.println("Total: "+tot);
			}
		}
		catch(Mark e)
		{
			System.out.println(e.getMessage());
		}
	}
}