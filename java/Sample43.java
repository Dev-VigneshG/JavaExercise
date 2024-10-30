class Test
{
	int a,b;
	void math(Test ob)
	{
		ob.a=ob.a+5;
		ob.b=ob.b*5;
	}
}
class Sample43
{
	public static void main(String[] a)
	{
		Test ob1 = new Test();
		ob1.a=20;
		ob1.b=40;
		System.out.println("before Value of a and b is "+ob1.a+ " "+ob1.b );
		Test ob2=new Test();
		ob2.math(ob1);
	System.out.println(" after Value of a and b is "+ob1.a+ " "+ob1.b );

		
	}
}