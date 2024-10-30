import java.io.*;
class Sample92
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
		String s=d.readLine();
		System.out.println("The Inputed String is"+s);
	}
}
