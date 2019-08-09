import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the n value");
int n=sc.nextInt();
int val=fibo(n);
System.out.println("nth value is"+val);
}
static int fibo(int n)
{
int n3=0;
int n1=1;
int n2=1;
if(n==1||n==2)
{
return 1;
}
else
{
for(int i=2;i<n;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
}
return n3;
}
}
}

