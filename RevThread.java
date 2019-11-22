import java.util.*;
class A implements Runnable
{
	B ob2;
	Thread t;
	A()
	{
		t=new Thread(this,"A");
		ob2=new B();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
			System.out.println("Hello from Thread 1");
	}
}
class B implements Runnable
{
	C ob2;
	Thread t;
	B()
	{
		t=new Thread(this,"B");
		ob2=new C();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

			System.out.println("Hello from Thread 2");
	}
}
class C implements Runnable
{
	D ob2;
	Thread t;
	C()
	{
		t=new Thread(this,"C");
		ob2=new D();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
			System.out.println("Hello from Thread 3");
		
	}
}
class D implements Runnable
{
	E ob2;
	Thread t;
	D()
	{
		t=new Thread(this,"D");
		ob2=new E();
		t.start();
	}
	public void run()
	{
		try
		{
			ob2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
			System.out.println("Hello from Thread 4");
	}
}
class E implements Runnable
{
	
	Thread t;
	E()
	{
		t=new Thread(this,"E");
		
		t.start();
	}
	public void run()
	{
		System.out.println("Hello from Thread 5");
	}
}
class RevThread
{
	public static void main(String args[])
	{
		new A();
	}
}


/*
Hello from Thread 5
Hello from Thread 4
Hello from Thread 3
Hello from Thread 2
Hello from Thread 1
*/

		
	
