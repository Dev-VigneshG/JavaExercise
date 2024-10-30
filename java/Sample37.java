class Sample37
{
  public static void main(String[] a)
  {
	int len=a.length;
	if(len==0)
	{
		System.out.println("No Data Provided");
	}
	else
	{
		for(int i=0;i<len;i++)
		{
			int n=Integer.parseInt(a[i]);
			if(n>0)
				System.out.println(n+" ");
		}
	}
	  
  }  
	
	
	
}