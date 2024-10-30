class Box
{
	double length;
	double breadth;
	double depth;
	Box()
	{
		length=5.6;
		breadth=7.7;
		depth=8.3;
	}
	Box(double l)
	{
		length=breadth=depth=l;
	}
	Box(double l,double b,double d)
	   {
		   length=l;
		   breadth=b;
		   depth=d;
	   }
	public String toString()
	{
		double v=length*breadth*depth;
		String s="The Volume Of Box is : "+v;
		return s;
	}
}
class Sample41
{
	public static void main(String[] a)
	{
		Box b1=new Box();
		Box b2=new Box(5.8);
		Box b3=new Box(7.4,8.3,9.5);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}