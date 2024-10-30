class Sample79
{
	public static void main(String[] args)
	{
		int a;
		try
		{
			 a=Integer.parseInt("ABC12");
			

		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception Occured");
			System.out.println("Number Format Exception occuured");
			a=0;
			
		}
		System.out.println(a);
	}
	
}