import java.util.*;
class Rectangle
{
	int length,width;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		
		length=sc.nextInt();
		width=sc.nextInt();
	}
	double area()
	{
		return (length*width);
	}
	void print()
	{
		System.out.println("length="+length);	
		System.out.println("width="+width);	
		System.out.println("Area="+area());	
	}
}
class Area
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println("enter the length and width of rectangle 1");
		r1.input();
		r1.print();
		System.out.println("enter the length and width of rectangle 2");
		r2.input();
		r2.print();
	}
}



