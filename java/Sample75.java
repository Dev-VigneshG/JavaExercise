class Sample75
{
	public static void main(String[] args)
	{
		int a=5;
		int b=0;
		int c=0;
		try{
		c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		System.out.println("The Value of  C is : "+c);
	}
}