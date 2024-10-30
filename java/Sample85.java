class Sample85
{
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException("Hello From Throw");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught : \n"+e);
			System.out.println(e.getMessage());
		}
	}
}