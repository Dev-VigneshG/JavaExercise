class A
{
	int i;
	
	A()
	{
		
	}
	void showi()
	{
		System.out.println("The Value Of i is "+i);
	}
	
}
class B extends A
{
	int j;
	B(int n,int m)
	{
		i=n;
		j=m;
		
	}
	void showij()
	{
		System.out.println("The Value of i & j is "+i+" "+ j);
	}
}

class Sample52
{
	public static void main(String[] a)
	{
		B ob=new B(5,4);
		ob.showi();
		ob.showij();
	}
	
}