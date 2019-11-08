package CIE;
import java.util.*;
public class Student
{
	Scanner sc=new Scanner(System.in);
	String usn,name;
	int sem;
	public void get()
	{
		System.out.println("enter usn,name and sem");
		usn=sc.next();
		name=sc.next();
		sem=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("USN="+usn);
		System.out.println("Name:"+name);
		System.out.println("sem="+sem);
	}
}
