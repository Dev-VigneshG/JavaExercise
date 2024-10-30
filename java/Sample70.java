import java.util.Scanner;
interface Test
{
	void getMark(int m1,int m2,int m3);
	void putMark();
}
class Student
{
	String name;
	String roll;
	Student(String n,String r)
	{
		name=n;
		roll=r;
	}
}
class Result extends Student implements Test
{
	int mark1,mark2,mark3,tot;
	Result(String n,String r)
	{
		super(n,r);
	}
	public void getMark(int m1,int m2,int m3)
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
		tot=m1+m2+m3;
	}
	public void putMark()
	{
		System.out.println("Mark 1: "+mark1+"\n Mark 2: "+mark2+"\n Mark 3: "+mark3);
		System.out.println("Total Mark : "+tot);
		
	}
}
class Sample70
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name Of The Student: ");
		String n=s.nextLine();
		System.out.println("Enter Roll Number Of The Student : ");
		String r=s.nextLine();
		Result result=new Result(n,r);
		System.out.println("Enter Mark 1 ,Mark 2, Mark 3 : ");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		result.getMark(m1,m2,m3);
		result.putMark();
	}
}