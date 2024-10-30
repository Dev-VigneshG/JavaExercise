class Test{
	int a;
	Test(int i)
	{
		a=i;
	}
	Test incrementByTen()
	{
		Test t=new Test(a+10);
		return t;
	}
}
class Sample48
{
 public static void main(String[] a)
 {
	 Test ob1=new Test(10);
     Test ob2=ob1.incrementByTen();	
System.out.println(ob1.a);	 
System.out.println(ob2.a);	 
 }
}