import java.util.*;
class Matrices
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row nd column size of matrix A");
		int ra=sc.nextInt();
		int ca=sc.nextInt();
		System.out.println("enter row nd column size of matrix B");
		int rb=sc.nextInt();
		int cb=sc.nextInt();
		int a[][]=new int[ra][ca];
		int b[][]=new int[rb][cb];
		int sum[][]=new int[ra][ca];
		int diff[][]=new int[ra][ca];
		if(ra==rb && ca==cb)
		{
			System.out.println("enter the elements of matrix A");
			for(int i=0;i<ra;i++)
			{
				for(int j=0;j<ca;j++)
				a[i][j]=sc.nextInt();
			}
			System.out.println("enter the elements of matrix B");
			for(int i=0;i<rb;i++)
			{
				for(int j=0;j<cb;j++)
				b[i][j]=sc.nextInt();
			}
			
			for(int i=0;i<ra;i++)
			{
				for(int j=0;j<ca;j++)
				{
					 sum[i][j]=a[i][j]+b[i][j];
					 diff[i][j]=a[i][j]-b[i][j];
				}		
			}
			System.out.println("the sum of array A and B is");
			for(int i=0;i<ra;i++)
			{
				for(int j=0;j<ca;j++)
				System.out.print(sum[i][j]+" ");
				System.out.print("\n");
			}
			System.out.println("the difference of array A and B is");
			for(int i=0;i<ra;i++)
			{
				for(int j=0;j<ca;j++)
				System.out.print(diff[i][j]+" ");
				System.out.print("\n");
			}
		}
		else
		System.out.println("the row size and column size of matrix A and B should be same");
	}
}
		

















