import java.util.*;
class Person
{
	Scanner sc=new Scanner(System.in);
	protected String name,address;
	protected int age;
	void get()
	{
		
		System.out.println("enter name address and age");
		name=sc.next();
		address=sc.next();
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
	}
}
class Student extends Person
{
	protected int rollno,sem;
	void get1()
	{
		System.out.println("enter rollno,sem");
		rollno=sc.nextInt();
		sem=sc.nextInt();
	}
	void display1()
	{
		System.out.println("Rollno:"+rollno);
		System.out.println("Sem:"+sem);
	}
}
class Exam extends Student 
{
	protected int marks1,marks2;
	void get2()
	{
		System.out.println("enter marks1 and marks2");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
	}
	double compute()
	{
		return ((marks1+marks2)*0.5);
	}
	void display2()
	{
		System.out.println("Marks1:"+marks1);
		System.out.println("Marks2:"+marks2);
		System.out.println("Average:"+compute());
	}
}
class Topper
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of students");
		int n=s.nextInt();
		Exam e[]=new Exam[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Exam();
			System.out.println("enter details of student"+(i+1));
			e[i].get();
			e[i].get1();
			e[i].get2();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Details are");
			e[i].display();
			e[i].display1();
			e[i].display2();
		}
		int top=0;
		double val=e[0].compute();
		for(int i=1;i<n;i++)
		{
			if(e[i].compute()>val)
			{
				top=i;
			}
		}
		System.out.println("topper details are");
		e[top].display();
		e[top].display1();
		e[top].display2();
	}
}





















