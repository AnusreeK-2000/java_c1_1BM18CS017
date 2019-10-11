import java.util.*;
class Student
{
	Scanner sc=new Scanner(System.in);
	String usn,name;
	int sem,n;
	void get()
	{
		System.out.println("enter usn name and sem");
		usn=sc.next();
		name=sc.next();
		sem=sc.nextInt();
		System.out.println("enter the no.of subjects");
		n=sc.nextInt();
	}
	void disp()
	{
		System.out.println("USN:"+usn);
		System.out.println("Name:"+name);
		System.out.println("sem:"+sem);
	}
}
class Test extends Student
{
	Scanner sc=new Scanner(System.in);
	
	int m[]=new int[n];
	int c[]=new int[n];
	void get()
	{
		super.get();
		System.out.println("enter the cie marks of each subject");
		for(int i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}	
		System.out.println("enter the credits of each subj");
		for(int i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
		}
	}
	void disp()
	{
		super.disp();
	}
}
class Exam extends Test
{
	int s[]=new int[n];
	int see[]=new int[n];
	void get()
	{
		super.get();
		System.out.println("enter the see marks ");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
			see[i]=s[i]/2;
		}
	}
	void disp()
	{
		super.disp();
	}
}
class Result extends Exam
{
	int g;
	String gr;
	int csum=0;
	double sgpa;
	double sum=0.0;
	int gpa[]=new int[n];
	int marks[]=new int[n];
	void get()
	{
		super.get();
	}
	void calc()
	{
		for(int i=0;i<n;i++)
		{
			marks[i]=m[i]+see[i];
		}
		for(int i=0;i<n;i++)
		{
			csum=csum+c[i];
		}
			
		for(int i=0;i<n;i++)
		{
			if(marks[i]>=90)
			{
				g=10;
				gr="s";
			}
			else if(marks[i]>=75&&marks[i]<90)
			{
				g=9;
				gr="A";
			}
			else if(marks[i]>=60&&marks[i]<75)
			{
				g=8;
				gr="B";
			}
			else if(marks[i]>=50&&marks[i]<60)
			{
				g=7;
				gr="C";
			}
			else if(marks[i]>=40&&marks[i]<50)
			{
				g=6;
				gr="D";
			}							
			else
			{
				g=0;
				gr="F";
			}
			gpa[i]=g;
			System.out.println("Grade of subject"+(i+1)+" is "+gr);
			
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+(double)(c[i]*gpa[i]);
		}
		
		sgpa=sum/csum;
	}
	void disp()
	{
		super.disp();
		System.out.println("SGPA:"+sgpa);
	}
}
class StudSgpa
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of students");
		int ns=sc.nextInt();
		Result st[]=new Result[ns];
		for(int i=0;i<ns;i++)
		{
			st[i]=new Result();
			st[i].get();
			st[i].calc();
			st[i].disp();
		}
	}
}

		

