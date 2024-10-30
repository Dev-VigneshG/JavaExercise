interface Vegetable
{
	void color();
	void wh_grow();
}
class Spinach implements Vegetable
{
	public void color()
	{
		System.out.println("Color Of Spinach is Green");
	}
	public void wh_grow()
	{
		System.out.println("Spinach grow Above Grow Ground");
	}
}
class Potato implements Vegetable
{
	public void color()
	{
		System.out.println("Color Of Potato is Browning White ");
	}
	public void wh_grow()
	{
		System.out.println("Potato grows under Ground");
	}
}
class Onion implements Vegetable
{
	public void color()
	{
		System.out.println("Color Of Potato is Red ");
	}
	public void wh_grow()
	{
		System.out.println("Potato grows under Ground");
	}
}
class Tomato implements Vegetable
{
	public void color()
	{
		System.out.println("Color Of Potato is Red ");
	}
	public void wh_grow()
	{
		System.out.println("Potato grows above Ground");
	}
}
class Sample71
{
	public static void main(String[] args)
	{
		Vegetable ptr[]=new Vegetable[4];
		ptr[0]=new Spinach();
		ptr[1]=new Potato();
		ptr[2]=new Onion();
		ptr[3]=new Tomato();
		for(int i=0;i<4;i++)
		{
			ptr[i].color();
			ptr[i].wh_grow();
		}
		
	}
}