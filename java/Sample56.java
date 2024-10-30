class A
{
	A()
	{
		System.out.println("1st constructor called..");
	}
}
class B extends A
{
	B()
	{
		System.out.println("2nd constructor called..");
	}
}
class C extends B
{
	C()
	{
		System.out.println("3rd constructor Callled..");
	}
}
class Sample56
{
	public static void main(String[] a)
	{
		C c=new C();
	}
}