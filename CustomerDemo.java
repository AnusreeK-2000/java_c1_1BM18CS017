import java.util.*;
class Customer
{
	Scanner sc=new Scanner(System.in);
	private int cusno;
	private String name;
	private double qty,price,tot,dis,net_price;
	Customer(int n,String name,double qty,double price)
	{
		cusno=n;
		this.name=name;
		this.qty=qty;
		this.price=price;
	}
	public void input()
	{
		System.out.println("enter customer no,name,quantity,price");
		cusno=sc.nextInt();
		name=sc.next();
		qty=sc.nextDouble();
		price=sc.nextDouble();
	}
	public double caldiscount()
	{
		tot=price*qty;
		if(tot>=50000)
			dis=0.25*tot;
		else if(tot>=25000&&tot<50000)
			dis=0.10*tot;
		else
			dis=0;
		net_price=tot-dis;
		return dis;
	}
	public void show()
	{
		System.out.println("Customer no:"+cusno);
		System.out.println("Customer name:"+name);
		System.out.println("Quantity:"+qty);
		System.out.println("Price:"+price);
		
		System.out.println("Discount:"+caldiscount());
		System.out.println("total price:"+tot);
		System.out.println("Net price:"+net_price);
	}
}
class CustomerDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of customers");
		int n=s.nextInt();
		Customer c[]=new Customer[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter customer no,name,quantity,price of customer"+(i+1));
			int no=s.nextInt();
			String name=s.next();
			double qty=s.nextDouble();
			double price=s.nextDouble();
			c[i]=new Customer(no,name,qty,price);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("details of customer"+(i+1));
			c[i].show();
		}
	}
}
			
		
		
		

	
		
	
		
		
		
		
	
