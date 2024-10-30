class Box
{
	double width;
	double length;
	double depth;
	Box()
	{
		
	}
	double volume()
	{
		return length*width*depth;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(double w,double l,double d,double wg)
	{
		length=l;
		width=w;
		depth=d;
		weight=wg;
	}
	void display()
	{
		System.out.println("Volume Of Box : "+volume());
        System.out.println("Weight of The Box : "+weight);
}
}
class Sample53
{
	public static void main(String[] a)
	{
		BoxWeight ob=new BoxWeight(7.2,4.7,10.3,20.7);
		ob.display();	
	}
}