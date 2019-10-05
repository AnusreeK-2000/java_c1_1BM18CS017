package DataBank;
import java.util.*;
public class Bank
{
	long accno;
	String name,bankname;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name accno and name of bank");
		name=sc.next();
		accno=sc.nextLong();
		bankname=sc.next();
	}
	public void display()
	{
		System.out.println("name="+name);
		System.out.println("account no.="+accno);
		System.out.println("Bank name="+bankname);
	}
}
		
