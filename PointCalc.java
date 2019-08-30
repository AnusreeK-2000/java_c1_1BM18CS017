import java.util.*;
class Point
{
	int x,y;
	Point()
	{
		x=0;
		y=0;
	}
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Point(Point ob)
	{
		x=ob.x;
		y=ob.y;
	}
	double dist(Point p)
	{
		double d=Math.sqrt((Math.pow((x-p.x),2)+Math.pow((y-p.y),2)));
		return d;
	}
}

class PointCalc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Point pd=new Point();
		System.out.println("enter x,y values of 1st point");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Point p1=new Point(a,b);
		Point p2=new Point(p1);
		System.out.println("enter x,y values of 2nd point");
		int c=sc.nextInt();
		int d=sc.nextInt();
		Point p3=new Point(c,d);
		System.out.println("Distance between 2 points is"+p1.dist(p3));
		System.out.println("Distance between 2 points is"+p2.dist(p3));
	}
}
		
