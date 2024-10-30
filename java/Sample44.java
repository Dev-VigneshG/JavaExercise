class Test2
{
	int a,b;
	void math(Test2 ob)
	{
		int t=ob.a;
		ob.a=ob.b;
		ob.b=t;
	}
}
class Sample44
{
 public static void main(String[] a)
 {
	 Test2 ob1=new Test2();
	 ob1.a=10;
	 ob1.b=20;
	 System.out.println("Before Value :"+ ob1.a+ " " + ob1.b);
	 Test2 ob2=new Test2();
	 ob2.math(ob1);
	 System.out.println("After Value :"+ ob1.a+ " " + ob1.b);
	 
 }
}