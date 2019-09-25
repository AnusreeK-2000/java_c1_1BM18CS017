import java.util.*;
abstract class Series
{
	Scanner sc=new Scanner(System.in);
	double a,n,d;
	void getvalues()
	{
		System.out.println("enter the no.of terms ,first term and the common difference of the series");
		n=sc.nextDouble();
		a=sc.nextDouble();
		d=sc.nextDouble();
	}
	abstract double sum();
}
class Ap extends Series
{
	double sum()
	{
		return (0.5*n*((2*a)+(n-1)*d));
	}
}
class Gp extends Series
{
	double sum()
	{
		return ((a*(Math.pow(d,n)-1))/(d-1));
	}
}
class SeriesDemo
{
	public static void main(String args[])
	{
		//Series ref[];
		Series ref[]=new Series[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter 1 for ap and 2 for gp");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:ref[i]=new Ap();
					ref[i].getvalues();
					System.out.println(ref[i].sum());
					break;
				case 2:ref[i]=new Gp();
					ref[i].getvalues();
					System.out.println(ref[i].sum());
					break;
				default:System.out.println("invalid input");
			}
		}
	}
}
		
		
