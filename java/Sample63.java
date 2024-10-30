import java.util.Scanner;
class Area
{
	double dim1;
	double dim2;
	Area(double a,double b)
	{
	 dim1=a;
	 dim2=b;
	}
	double area()
	{
		System.out.println("No Area Defined");
		return 0.0;
	}
	
}
class Rectangle extends Area
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2;
	}
}
class Triangle extends Area
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return 0.5*dim1*dim2;
	}
}
class Circle extends Area{
	Circle(double r)
	{
		super(r,r);
	}
	double area()
	{
		return 3.14*dim1*dim2;
	}
}

class Sample63
{
	public static void main(String[] ar)
	{
		Area a=new Area(2,4);
		int ch;
		Scanner S=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Your Choice :\n 1.RECTANGLE \n 2.TRIANGLE \n 3.CIRCLE \n 4.EXIT");
			ch=S.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter Length & Breadth Of Rectangle ");
				       double l=S.nextDouble();
				       double b=S.nextDouble();
					   Rectangle r=new Rectangle(l,b);
					   a=r;
					   break;
				case 2:System.out.println("Enter Base & Height Of The Triangle");
				       double base=S.nextDouble();
				       double height=S.nextDouble();
                       Triangle t=new Triangle(base ,height);
                       a=t;
					   break;
                case 3:System.out.println("Enter Radius Of The Circle");
                       double radius=S.nextDouble();
                       Circle c=new Circle(radius);
                       a=c;
                       break;					   
				case 4:System.exit(0);
				default:
				         System.out.println("Invalid Choice");
			}
			System.out.println("Area Of Shape is "+a.area() );
		}
	}
}