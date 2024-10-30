class Sample81
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		int b;
		try{
		 b=25/a[6];
		System.out.println(b);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			b=0;
			System.out.println("Exception Caught ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(b);
	}
}