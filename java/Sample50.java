import java.util.Scanner;
class Sample50
{
	public static void main(String[] a)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting Limit:");
        int start=s.nextInt();
		System.out.println("Enter Ending Limit:");
        int end=s.nextInt();
		boolean flag=false;
		System.out.println("Prime Numbers:");
		for(int i=start;i<=end;i++)
		{
			if(i==1)
				continue;
            flag=false;			
	      for(int j=2;j<=i/2;j++)
		     {
			if(i%j==0)
		    	{
				flag=true;
				break;
			    }
		     }
		if(!flag)
		System.out.println(i);
		}
	}
}             