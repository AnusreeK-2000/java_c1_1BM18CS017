import java.util.*;
abstract class Account
{
	Scanner sc=new Scanner(System.in);
	String name,type;
	long acc_no;
	double bal=0.0;
	void input()
	{
		System.out.println("enter customer name,acc no. and type of account");
		name=sc.next();
		acc_no=sc.nextLong();
		type=sc.next();
	}
	void display()
	{
		System.out.println("Balance="+bal);
	}
	void deposit()
	{
		System.out.println("enter the amount to be deposited");
		double deposit=sc.nextDouble();
		bal=bal+deposit;
	}
	void withdraw()
	{
		System.out.println("enter the amount to be withdrawn");
		double draw=sc.nextDouble();
		bal=bal-draw;
	}
	void interestCal()
	{
	}
	void service()
	{
	}
	
}
class Sav_acct extends Account
{
	final double r=5;
	int t;
	double interest;
	Scanner s=new Scanner(System.in);
	void input()
	{
		super.input();
		System.out.println("enter the time");
		t=s.nextInt();
	}
		
	void interestCal()
	{
		
		interest=bal*(Math.pow((1+(r*0.01)),t));
		bal=bal+interest;
	}
	void display()
	{
		
		System.out.println("Interest="+interest);
		super.display();
	}
}
class Curr_acct extends Account
{
	Scanner sc=new Scanner(System.in);
	final double min=1000.00;
	final double ser=800.00;
	void input()
	{
		super.input();
	}
	void service()
	{
		if(bal<min)
			bal=bal-ser;
	}
	void display()
	{
		super.display();
	}
}
class Bank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for savings 2 for current account");
		int ch=sc.nextInt();
		Account ref;
		if(ch==1)
		{
			ref=new Sav_acct();
			
		}
		else 
		{
			ref=new Curr_acct();
			
		}
		ref.input();
		ref.deposit();
		ref.withdraw();
		ref.interestCal();
		ref.service();
		ref.display();

		
	}
}
