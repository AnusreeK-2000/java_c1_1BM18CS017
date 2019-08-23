import java.util.*;
class Time
{
	int hr,min,sec;
	Time()
	{
		hr=0;
		min=0;
		sec=0;
	}
	Time(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	void current(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	void advance(int h,int m,int s)
	{
		sec+=s;
		min=min+m+(sec/60);
		sec=sec%60;
		hr=hr+h+(min/60);
		min=min%60;
		hr=hr%24;
	}
	void print()
	{
		System.out.println(hr+":"+min+":"+sec);
	}
}
class TimeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hrs mins secs");
		int hh=sc.nextInt();
		int mm=sc.nextInt();
		int ss=sc.nextInt();
		Time t=new Time(hh,mm,ss);
		System.out.println("enter 1 to reset time,2 to advance time,3 to print,-1 to exit");
		int ch=sc.nextInt();
		while(ch!=-1)
		{
			switch(ch)
			{
				case 1: System.out.println("enter hrs mins nd secs");
					 hh=sc.nextInt();
					 mm=sc.nextInt();
					 ss=sc.nextInt();
					t.current(hh,mm,ss);
					break;
				case 2: System.out.println("enter the amount of hrs mins and secs to be advanced");
					 hh=sc.nextInt();
					 mm=sc.nextInt();
					 ss=sc.nextInt();
					t.advance(hh,mm,ss);
					break;
				case 3: t.print();
					break;
				default:System.out.println("invalid input");
			}
			System.out.println("enter the next choice");				
			ch=sc.nextInt();
		}
	}
}






























	
