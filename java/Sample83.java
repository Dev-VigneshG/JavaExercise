import java.util.Random;
class Sample83
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
		catch(ArithmeticException e)
		{
			c=0;
			System.out.println("Exception caught "+e);
		}
		finally
	    {
			System.out.println("The Value Of C is "+c);
		}
	}
}