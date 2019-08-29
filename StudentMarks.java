import java.util.*;
class StudentMarks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of students followed by no.of subjects");
		int n=sc.nextInt();
		int m=sc.nextInt();
		double a[][]=new double[n+2][m+2];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the marks of Student"+(i+1));
			for(int j=0;j<m;j++)
			{
				System.out.println("enter the marks of Subject"+(j+1));	
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			double sum=0.0;
			
			for(int j=0;j<m;j++)
			{
					
				sum=sum+a[i][j];
			}
			a[i][m]=sum;
			a[i][m+1]=sum/m;
			
		}
		for(int j=0;j<m;j++)
		{
			double sum=0.0;
			
			for(int i=0;i<n;i++)
			{
					
				sum=sum+a[i][j];
			}
			a[n][j]=sum;
			a[n+1][j]=sum/m;
			
		}
		for(int i=0;i<n+2;i++)
		{
			for(int j=0;j<m+2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
