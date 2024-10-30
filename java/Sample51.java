import java.util.Scanner;
class Box	
{
	static int count=0;
	double length;
	double width;
	double depth;
	Box()
	{
		length=width=depth=5;
	}
}
class Sample51
{
	public static void main(String a[]) 
	{
		Scanner s=new Scanner(System.in);
		Box b[]=new Box[20];
		int i=0;int ch;
	   do
	   {
		   System.out.println("do you want to continue or no??\n 1.create 0.exit");
		   ch=s.nextInt();
		   
		   b[i]=new Box();
		   i++;
		   b[i].count++;
		   
		   
	   }while(ch==1);
	   System.out.println("total object:"+Box.count);
	}
}