import java.util.*;
class Account
{
	String name;
	int cust_no;
	double balance;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,customer no. and balance");
		name=sc.next();
		cust_no=sc.nextInt();
		balance=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Customer no.:"+cust_no);
		System.out.println("Balance:"+balance);
	}
}
class SavingsAccount extends Account
{
	double interest,rate;
	int time;
	void input1()
	{
		input();
		Scanner s=new Scanner(System.in);
		System.out.println("enter rate and time");
		rate=s.nextDouble();
		time=s.nextInt();
	}

	double compute()
	{
		interest=balance*rate*time;
		return interest;
		
	}
	void display1()
	{
		display();
		System.out.println("rate:"+rate);
		System.out.println("time:"+time);
		System.out.println("Interest:"+compute());
	}
}
class AccountDemo
{
	public static void main(String args[])
	{
		SavingsAccount ob=new SavingsAccount();
		ob.input1();
		ob.display1();
	}
}
		
		

