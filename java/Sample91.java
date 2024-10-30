class Sample91
{
	public static void main(String[] args)
	{
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int q=0;
		try
		{
			q=a/b;
			System.out.println(q);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide By Zero");
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Incorrect Argument type");
		}
	}

}