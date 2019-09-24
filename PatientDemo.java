import java.util.*;
class Patients
{
	int id,age;
	String name,doc;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		name=sc.next();
		age=sc.nextInt();
		doc=sc.next();
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("doctor:"+doc);
	}
}
class PatientDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);		
		System.out.println("enter the no.of patients");
		int n=s.nextInt();
		Patients p[]=new Patients[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Patients();
			System.out.println("enter id name age and doctor of patient"+i+1);
			p[i].input();
		}
		System.out.println("enter the patient id");
		int pid=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(p[i].id==pid)
			p[i].display();
		}
		System.out.println("enter the name of the doctor");
		String docn=s.next();
		for(int i=0;i<n;i++)
		{
			if(p[i].doc==docn)
			{
				p[i].display();
			}

		}
	}
}
