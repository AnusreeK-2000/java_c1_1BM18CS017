import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("enter the elements of the array");
		int sum=0;
		for(int i=0;i<s;i++)
		arr[i]=sc.nextInt();
		for(int x:arr)
		sum+=x;
		System.out.println("sum is"+sum);
	}
}
