import java.util.*;
class T1 implements Runnable
{
	Thread t1;
	T1()
	{
		t1=new Thread(this,"T1");
		t1.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMS College of Engineering");
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println("BMSCE interrupted");
			}
		}
	}
}
class T2 implements Runnable
{
	Thread t2;
	T2()
	{
		t2=new Thread(this,"T1");
		t2.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("CSE interrupted");
			}
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		new T1();
		new T2();
	}
}


/*
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
*/



