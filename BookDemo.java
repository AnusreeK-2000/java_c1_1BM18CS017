import java.util.*;
class Book
{
	String name,author;
	double price;
	int num_pages;
	Book()
	{
		name="\0";
		author="\0";
		price=0.0;
		num_pages=0;
	}
	void set()
	{
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		author=sc.next();
		price=sc.nextDouble();
		num_pages=sc.nextInt();
	}
	public String toString()
	{
		String s="name:"+name+"\n author:"+author+"\n price:"+price+"\n no.of pages:"+num_pages;
		return s;
	}
	void get()
	{
		System.out.println(toString());
	}
}
class BookDemo
{
	public static void main(String args[])
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the no.of book objects");
		int n=sca.nextInt();
		Book arr[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Book();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("enter name,author,price,no.of pages of book"+(i+1));
			arr[i].set();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("details of book"+(i+1));
			arr[i].get();
		}
	}
}
		
