import java.util.*;
class As implements Runnable
{
	int ar[];
	
	Thread t1;
	As(int a[])
	{
		t1=new Thread(this,"T1");
		t1.start();
		ar=new int[a.length];
		ar=a;
	}
	synchronized public void run()
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<((ar.length)-i);j++)
			{
				if(ar[j-1]>ar[j])
				{
				int t=ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=t;
				}
			}
		}
		System.out.println("Ascending order is");
		for(int i=0;i<(ar.length);i++)
		{
			System.out.println(ar[i]);
		}

			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Ascending interrupted");
			}
		
		
	}
}
class Desc implements Runnable
{
	int ar[];
	
	Thread t2;
	Desc(int a[])
	{
		t2=new Thread(this,"T1");
		t2.start();
		ar=new int[a.length];
		ar=a;
	}
	synchronized public void run()
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1;j<((ar.length)-i);j++)
			{
				if(ar[j-1]<ar[j])
				{
				int t=ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=t;
				}
			}
		}
		System.out.println("Descending order is");
		for(int i=0;i<(ar.length);i++)
		{
			System.out.println(ar[i]);
		}

			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Descending interrupted");
			}
		
		
	}
}
class AscDescT
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		As ob1=new As(a);
		Desc ob2=new Desc(a);
	}
}


/*
Enter the size of the array
4
enter the elements of the array
1 4 3 5
Ascending order is
1
3
4
5
Descending order is
5
4
3
1
*/

