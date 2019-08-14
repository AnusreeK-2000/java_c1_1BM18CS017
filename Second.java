import java.util.*;
class Second
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("enter the elements of the array");
		for(int i=0;i<s;i++)
		a[i]=sc.nextInt();
		int t=0;
		for(int i=0;i<s;i++)
		{
			for(int j=1;j<s-i;j++)
			{
				if(a[j-1]>a[j])
				{
				 t=a[j-1];
				 a[j-1]=a[j];
				 a[j]=t;
				}
			}
		}
		System.out.println("second largest element is"+a[s-2]);
	}
}

				
