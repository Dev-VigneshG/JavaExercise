class A
{
	int i;
	int j;
	A(int a,int b)
	{
		i=a;
		j=b;
	}
	void show()
	{
		System.out.println("The Value Of i & j are :"+i+" "+j);
	}
}
class B extends A
{
	int k;
	B(int a,int b,int c)
	{
		super(a,b);
		k=c;
	}
	void show()
	{
		System.out.println("The Value Of K is :"+k);
	}
}
class Sample61
{
	public static void main(String[] a)
	{
		B b=new B(8,10,63);
		b.show();
	}
}