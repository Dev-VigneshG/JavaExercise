class Box
{
	double width;
	double height;
	double depth;
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
	BoxWeight(double w,double l,double d,double wg)
	{
		super(w,l,d);
		weight=wg;
	}
}
class Shipment extends BoxWeight
{
	double cost;
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
class Sample57
{
	public static void main(String[] a)
	{
		Shipment ship=new Shipment(2.4,6.3,3.6,6.3,8.3);
		ship.display();
	}
}