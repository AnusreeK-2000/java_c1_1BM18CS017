import java.util.*;
class WrongAge extends Exception
{
	public String toString()
	{
		return "Exception:Wrong age";
	}
}

class Father
{
	Scanner sc=new Scanner(System.in);
	int fage;
	Father(int a)throws WrongAge
	{
		
		System.out.println("enter father's age");
		fage=sc.nextInt();
		if(fage<a || fage<0 || a<0)
		{
			throw new WrongAge();
		}
		
	}
}
class Son extends Father
{
	int sage;
	Son(int s)throws WrongAge
	{
		super(s);
		sage=s;
	}
}
class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter son's age");
		int sa=sc.nextInt();
		try
		{
			Son ob=new Son(sa);
		}
		catch(WrongAge w)
		{
			System.out.println(w);
		}
	}
}
