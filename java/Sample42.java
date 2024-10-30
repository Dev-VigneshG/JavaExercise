class Test
{
  void math(int a,int b)
  {
	  a=a+5;
	  b=b*5;
  }
	
}
class Sample42
{ public static void main(String a[])
	{
	int a1=10;
	int b1=5;
	System.out.println("The Value of a1 & b1 before call is" +a1+" "+b1);
	Test ob=new Test();
	ob.math(a1,b1);
	System.out.println("The Value of a1 & b1 after call is "+a1+ " " +b1);
}
}