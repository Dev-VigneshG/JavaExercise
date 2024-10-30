import java.util.*;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class Sample88
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=s.nextInt();
		try
		{
			if(age<18)
			{
				MyException m=new MyException("Since Your Age less than 18 your are not eligible for voting");
			    throw m;
			}
			System.out.println("You Are Eligible for Voting");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
