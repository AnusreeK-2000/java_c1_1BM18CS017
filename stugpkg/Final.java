import java.util.*;
import CIE.*;
import SEE.*;
class Final
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of students");
		int n=sc.nextInt();
		External e[]=new External[n];
		Internals in[]=new Internals[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Student"+(i+1));
			e[i]=new External();
			in[i]=new Internals();
			in[i].get();
			e[i].get();
			int f[]=new int[5];
			for(int j=0;j<5;j++)
			{
				f[j]=e[i].sm[j]+in[i].m[j];
			}
			in[i].disp();
			e[i].disp();
			System.out.println("Final marks out of 100 are");
			for(int j=0;j<5;j++)
			{
				System.out.println(f[j]);
			}
		}
	}
}
			
		
		
