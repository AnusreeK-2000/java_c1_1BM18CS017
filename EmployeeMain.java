import java.util.*;
class Employee
{
	int eno;
	String name;
	double basic,da,it,netsal;
	void input()
	{
		System.out.println("Enter employee number,name,basic");
		Scanner sc=new Scanner(System.in);
		eno=sc.nextInt();
		name=sc.next();
		basic=sc.nextFloat();
	}
	double net()
	{
		da=0.75*basic;
		it=0.30*(basic+da);
		netsal=(basic+da)-it;
		return netsal;
	}
	void display()
	{
		System.out.println("employee number : "+eno);
		System.out.println("employee name : "+name);
		System.out.println("basic : "+basic);
		System.out.println("DA : "+da);
		System.out.println("IT : "+it);
		System.out.println("Net salary : "+net());
	}
}

class EmployeeMain
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			e.input();
			e.display();
		}
	}
}
		
	
