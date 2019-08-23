import java.util.*;
class Student
{
	String usn,name;
	int cred[],marks[];
	int n;
	int gpa[];
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter usn ,name");
		usn=sc.next();
		name=sc.next();
		System.out.println("enter the no.of subjects");
		n=sc.nextInt();
		System.out.println("enter the credits of n subjects");
		cred=new int[n];
		for(int i=0;i<n;i++)
		{
			cred[i]=sc.nextInt();
		}
		System.out.println("enter the marks of n subjects");
		marks=new int[n];
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
	}

	double compute()
	{
		int g;
		int csum=0;
		double sgpa;
		double sum=0.0;
		gpa=new int[n];
		for(int i=0;i<n;i++)
		{
			csum=csum+cred[i];
		}
			
		for(int i=0;i<n;i++)
		{
			if(marks[i]>=90)
				g=10;
			else if(marks[i]>=75&&marks[i]<90)
				g=9;
			else if(marks[i]>=60&&marks[i]<75)
				g=8;
			else if(marks[i]>=50&&marks[i]<60)
				g=7;
			else if(marks[i]>=40&&marks[i]<50)
				g=6;
			else
				g=0;
			gpa[i]=g;
			
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+(double)(cred[i]*gpa[i]);
		}
		sgpa=sum/csum;
		return sgpa;
	}


	void display()
	{
		System.out.println("USN: "+usn);
		System.out.println("Name: "+name);
		System.out.println("credits are");
		for(int i=0;i<n;i++)
		{
			System.out.print(cred[i]+" ");
		}
		System.out.println("marks are");
		for(int i=0;i<n;i++)
		{
			System.out.print(marks[i]+" ");
		}
		System.out.println("SGPA: "+compute());
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.input();
		st.display();
	}
}
		


























		
	
		
 
