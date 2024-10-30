import java.util.Random;
class Sample77
{
	public static void main(String[] args)
	{
		int a,b,i,c;
		Random r=new Random();
		for(i=0;i<=20;i++)
		{
			try
			{
				a=r.nextInt();
				b=r.nextInt();
				System.out.println(a+" "+ b);
				c=a/b;
			}
			catch(ArithmeticException e)
			{
				c=0;
				System.out.println("Divide by Zero Occurs "+e);
			}
			System.out.println("The Value Of C is "+c);
		}
	}
}