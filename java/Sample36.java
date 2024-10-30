class Sample36
{
public static void main(String[] a)
{
	int sum=0;
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
			sum+=n;
		}
	}
	System.out.println(sum);
	
}
	
	
	
}