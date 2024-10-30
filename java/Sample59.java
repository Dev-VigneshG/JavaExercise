class A
{
	int i;
	A(int n)
	{
		i=n;
	}
}
class B extends A
{
	int i;
	B(int n,int m)
	{
		super(n);
		i=m;
	}
	void display()
	{
		System.out.println("The Value Of i In super Class A is :"+ super.i);
		System.out.println("The Value Of i In sub Class B is :"+ i);
	}
}
class Sample59
{
	public static void main(String[] a)
	{
		B b=new B(4,7);
		b.display();
	}
}