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
		String s="Name:"+name+"\n Author:"+author+"\n Price:"+price+"\n No.of pages:"+num_pages;
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
		System.out.println("Enter the no.of book objects");
		int n=sca.nextInt();
		Book arr[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Book();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name,author,price,no.of pages of book"+(i+1));
			arr[i].set();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of book"+(i+1));
			arr[i].get();
		}
	}
}




/*
Output:
Enter the no.of book objects
2
Enter name,author,price,no.of pages of book1
abc xyz 345.67 100
Enter name,author,price,no.of pages of book2
def uvw 567.89 345
Details of book1
Name:abc
 Author:xyz
 Price:345.67
 No.of pages:100
Details of book2
Name:def
 Author:uvw
 Price:567.89
 No.of pages:345
*/

		
