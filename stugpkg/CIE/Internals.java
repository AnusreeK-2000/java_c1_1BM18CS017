package CIE;
import java.util.*;

public class Internals extends Student
{
	Scanner sc=new Scanner(System.in);
	public int m[]=new int[5];
	public void get()
	{
		super.get();
		System.out.println("enter cie marks of 5 subjects out of 50");
		for(int i=0;i<5;i++)
			m[i]=sc.nextInt();
	}
	public void disp()
	{
		super.disp();
		System.out.println("cie marks in each subject are");
		for(int i=0;i<5;i++)
		{
			System.out.println(m[i]);
		
		}
	}
}

