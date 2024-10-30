import java.util.Random;
class Sample84
{
	public static void main(String[] args)
	{
		Random r=new Random();
		int a=r.nextInt();
		int b=r.nextInt();
		int c=0;
		try
		{
			c=a/b;
		}
		finally
		{
			System.out.println("The Value Of c is :"+c);
		}
	}
}