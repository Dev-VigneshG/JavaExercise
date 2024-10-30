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
	public String toString()
	{
		double v=length*breadth*depth;
		String s="The Volume Of Box is : "+v;
		return s;
	}
}
class Sample40
{
	public static void main(String[] a)
	{
		Box b1=new Box();
		System.out.println(b1);
	}
}