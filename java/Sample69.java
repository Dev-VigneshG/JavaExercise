import java.util.Scanner;
interface Area
{
	final float PI=3.14f;
	double area();
}
class Rectangle implements Area
{
	double length,breadth;
	Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	public double area()
	{
	return length*breadth;
	}
	
}
class Triangle implements Area
{
	double base,height;
	Triangle(double b ,double h)
	{
		base=b;
		height=h;
	}
    public double area()
	{
		return 0.5*base*height;
	}
}
class Circle implements Area
{
	double radius;
	Circle(double r)
	{
		radius=r;
	}
	public double area()
	{
		return PI*radius*radius;
	}
}
class Sample69
{
	public static void main(String[] args)
	{ 
	    Area a=null;
		Scanner s=new Scanner(System.in);
		do
		{
		 System.out.println("Enter Your Choice: ");
		 System.out.println("1. Rectangle \n 2. Triangle \n 3. Circle \n 4.EXIT ");
		 int ch=s.nextInt();
		 switch(ch)
		 {
			 case 1:
	                System.out.println("Enter Height & Width Of Rectangle");
					double h=s.nextDouble();
					double w=s.nextDouble();
					Rectangle rect=new Rectangle(h,w);
					a=rect;
					break;
			case 2:
			       System.out.println("Enter Base & Height Of TriAngle :");
				   double base=s.nextDouble();
				   double height=s.nextDouble();
				   Triangle tri=new Triangle(base,height);
				   a=tri;
				   break;
			case 3:
			       System.out.println("Enter Radius Of Circle :");
				   double r=s.nextDouble();
				   Circle cir=new Circle(r);
				   a=cir;
				   break;
			case 4:
			       System.exit(0);
				   break;
		 }
		 System.out.println("Area Of Shape is : "+a.area());
		}while(true);
	}
	
}