import java.util.*;
class Gen<T,V>
{
	T a;
	V b;
	Gen(T ob1,V ob2)
	{
		a=ob1;
		b=ob2;
		System.out.println(ob1+" "+ob2);
	}
	
}
class Generics
{
	public static void main(String args[])
	{
		Gen<Integer,String> o1=new Gen<Integer,String>(3,"abc");
		Gen<Double,Character> o2=new Gen<Double,Character>(345.556,'a');
		
	}
}
