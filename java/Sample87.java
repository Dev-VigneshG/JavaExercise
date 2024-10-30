class Sample87
{
	public static void main(String[] args)
	{
		int num;
		for(num=10;num<=30;num+=10)
		{
			try
			{
				if(num==20)
				{
					throw new ArithmeticException("ArithmeticException");
				}
				else if(num<20)
				{
					throw new RuntimeException("Runtime");
				}
				else
				{
					throw new NullPointerException("Null Pointer");
				}
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Caught an Exception");
				System.out.println(e.getMessage());
			}
			
			catch(NullPointerException e)
			{
				System.out.println("Caught an Exception");
				System.out.println(e.getMessage());
			}
			catch(RuntimeException e)
			{
				System.out.println("Caught an Exception");
				System.out.println(e.getMessage());
			}
			
		}
	}
}