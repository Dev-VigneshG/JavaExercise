import java.util.*;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}  
class Sample89
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A String:");
		String str=s.nextLine();
		try
		{
			if(!str.equalsIgnoreCase("india"))
			{
				MyException m=new MyException("Your String is not India");
				throw m;

			}
			System.out.println("Your String is  india");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}