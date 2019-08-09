import java.util.*;
class Quadratic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a,b,c values");
int a,b,c,d;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=b*b-(4*a*c);
if(d==0)
{
double r=-b/(2*a);
System.out.println("roots are real and equal and roots are"+r+"and"+r);
}
else if(d>0)
{
double r1=-b+(Math.sqrt(d))/(2*a);
double r2=-b-(Math.sqrt(d))/(2*a);
System.out.println("roots are real and distinct and roots are"+r1+"and"+r2);
}
else
{
System.out.println("roots are imaginary");
}
}
}



