class Box
{
	double width;
	double length;
	double depth;
	Box(double w,double l ,double d)
	{
		width=w;
		length=l;
		depth=d;
		
	}
	Box()
	{
		length=8.7;
		width=4.5;
		depth=6.6;
	}
	Box(double l)
	{
		length=width=depth=l;
	}
	double volume()
	{
		return length*width*depth;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(double l,double w,double d,double wg)
	{
		super(l,w,d);
		weight=wg;
	}
	BoxWeight()
	{
		super();
		weight=30;
	}
	BoxWeight(double l,double wg)
	{
		super(l);
		weight=wg;
	}
	void display()
	{
		System.out.println("Volume Of Box : "+volume());
        System.out.println("Weight of The Box : "+weight);
}
}
class Sample55
{
	public static void main(String[] a)
	{
		BoxWeight ob1=new BoxWeight();
		BoxWeight ob2=new BoxWeight(5.7,8.4);
		BoxWeight ob3=new BoxWeight(7.2,4.7,10.3,20.7);
		ob1.display();
        ob2.display();
        ob3.display();		
	}
}