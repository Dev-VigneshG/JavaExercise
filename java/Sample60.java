import java.util.Scanner;
class Area{
	double length;
	double breadth;
	Area(double l,double w)
	{
		length=l;
		breadth=w;
	}
}
class RectAngle extends Area
{
	RectAngle(double l,double w)
	{
		super(l,w);
	}
	double rectarea()
	{
		return length*breadth;
	}

}
class Triangle extends Area
{
	Triangle(double h,double b)
	{
		super(h,b);
	}
	double triarea()
	{
		return 0.5*length*breadth;
	}
}
class Circle extends Area{
	Circle(double r)
	{
		super(r,r);
	}
	double cirarea()
	{
		return 3.14*length*breadth;
	}
}
class Sample60
{
	public static void main(String[] a)
	{
		Scanner S= new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Enter Your Choice: \n 1.Rectangle \n 2.Triangle \n 3.Circle \n 4.Exit");
			ch=S.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter Length & breadth Of The RectAngle .");
				           double length=S.nextDouble();
						   double breadth=S.nextDouble();
						   RectAngle rect=new RectAngle(length,breadth);
						   System.out.println("Area Of rectangle is "+rect.rectarea());
						   break;
				case 2:
				            System.out.println("Enter Height & Base Of The Triangle ");
							double height=S.nextDouble();
							double base=S.nextDouble();
							Triangle tri=new Triangle(height,base);
							System.out.println("Area Of triangle is "+tri.triarea());
							break;
				case 3:
				          System.out.println("Enter Radius Of The Circle");
						  double radius=S.nextDouble();
						  Circle cir=new Circle(radius);
						  System.out.println("Area Of circle is "+cir.cirarea());
						  break;
				case 4:return;
				default:
				             System.out.println("Invalid Choice Please Enter Correct choice");
			}
		}
		
	}
}