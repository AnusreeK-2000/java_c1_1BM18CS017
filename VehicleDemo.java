import java.util.*;
class Vehicle
{
	String model,color;
	int year;
	static int total;
	Vehicle(String m,String c,int yr)
	{
		model=m;
		color=c;
		year=yr;
		total++;
	}
	void output()
	{
		System.out.println("Model:"+model);
		System.out.println("Color:"+color);
		System.out.println("Year:"+year);
	}
	static void out()
	{
		System.out.println("total no.of vehicles:"+total);
		
	}
	
}
class VehicleDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of vehicles");
		int n=sc.nextInt();
		Vehicle v[]=new Vehicle[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the model,color,year of vehicle"+(i+1));
			String m=sc.next();
			String c=sc.next();
			int yr=sc.nextInt();
	
			v[i]=new Vehicle(m,c,yr);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of vehicle "+(i+1));
			v[i].output();
		}
		Vehicle.out();
	}
}
