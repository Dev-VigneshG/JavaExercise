class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		width=height=depth=7.3;
	}
	Box(double w)
	{
		width=height=depth=w;
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight()
	{
		super();
		weight=3.6;
	}
	BoxWeight(double w)
	{
		super(w);
		weight=w;
	}
	BoxWeight(double w,double l,double d,double wg)
	{
		super(w,l,d);
		weight=wg;
	}
}
class Shipment extends BoxWeight
{
	double cost;
	Shipment()
	{
		super();
		cost=6.7;
	}
	Shipment(double c)
	{
		super(c);
		cost=c;
	}
	
	Shipment(double w,double l,double d,double wg,double c)
	{
		super(w,l,d,wg);
		cost=c;
	}
	void display()
	{
		System.out.println("Volume of the Box : "+volume());
		System.out.println("weight of the Box : "+weight);
		System.out.println("Cost of the Box : "+cost);
		
	}
}
class Sample58
{
	public static void main(String[] a)
	{
		Shipment ship1=new Shipment();
		Shipment ship2=new Shipment(2.4);
		Shipment ship3=new Shipment(2.4,6.3,3.6,6.3,8.3);
		ship1.display();
		System.out.println();
		ship2.display();
		System.out.println();
		ship3.display();
	}
}