package SEE;
import CIE.*;
import java.util.*;
public class External extends Student
{
	Scanner sc=new Scanner(System.in);
	public int sm[]=new int[5];
	public void get()
	{
		
		System.out.println("enter see marks of 5 subjects out of 50");
		for(int i=0;i<5;i++)
			sm[i]=sc.nextInt();
	}
	public void disp()
	{
		
		System.out.println("see marks in each subject are");
		for(int i=0;i<5;i++)
		{
			System.out.println(sm[i]);
		
		}
	}
}
