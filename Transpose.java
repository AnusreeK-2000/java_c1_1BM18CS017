import java.util.*;
class Transpose
{
  public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size and column size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter the elements of the array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			a[i][j]=sc.nextInt();
		}
		int at[][]=new int[c][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			at[j][i]=a[i][j];
		}
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			System.out.print(at[i][j]+" ");
			System.out.print("\n");
		}
	}
}
		
