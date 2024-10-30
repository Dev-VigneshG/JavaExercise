import java.util.Scanner;
class Sample38
{
public static void main(String[] a)
{
	Scanner s=new Scanner(System.in);
	String name[]=new String[5];
	System.out.println("Enter Five Names:");
	for(int i=0;i<name.length;i++)
	{
		name[i]=s.nextLine();
	}
	for(int i=0;i<name.length;i++)
	{
		for(int j=i+1;j<name.length;j++)
		{
			if(name[i].compareTo(name[j])>1)
			{
				String t=name[i];
				name[i]=name[j];
				name[j]=t;
			}
		}
	}
	System.out.println("Ascending Order:");
    for(int i=0;i<name.length;i++)
	{
		System.out.println(name[i]);
	}
}
}