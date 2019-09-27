import java.util.*;
interface Stack
{
	void push(int item);
	int pop();
	void display();
}
class Dynamic implements Stack
{
	int size,top,stk[];
	
	Dynamic()
	{
		top=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		size=sc.nextInt();
		stk=new int[size];
	}
	
	public void push(int item)
	{
		if(top==size-1)
		{
			size=size*2;
			int temp[]=new int[size];
			for(int i=0;i<size/2;i++)
			{
				temp[i]=stk[i];
			}
			
			stk=temp;
			stk[++(top)]=item;
		}
		else
			stk[++(top)]=item;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("stack underflow");
			return -9999;
		}

		else
			return stk[(top)--];
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println("elements are");
			for(int i=top;i>=0;i--)
				System.out.println(stk[i]);
		}
	}
}
class Dynamicstk
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Stack ref=null;
		ref=new Dynamic();	
		System.out.println("enter 1 to push ,2 to pop ,3 to display, -1 to exit");
		int ch=s.nextInt();
		while(ch!=-1)
		{
			switch(ch)
			{
				case 1:System.out.println("enter the item");
				int item=s.nextInt();
				ref.push(item);
				break;
				case 2:System.out.println("popped element="+ref.pop());
				break;
				case 3:ref.display();
				break;
				default:System.out.println("invalid input");
			}
			System.out.println("enter 1 to push ,2 to pop ,3 to display, -1 to exit");
			ch=s.nextInt();
		}
	}
}


/*enter size
2
enter 1 to push ,2 to pop ,3 to display, -1 to exit
1
enter the item
1
enter 1 to push ,2 to pop ,3 to display, -1 to exit
1
enter the item
2
enter 1 to push ,2 to pop ,3 to display, -1 to exit
1
enter the item
3
enter 1 to push ,2 to pop ,3 to display, -1 to exit
3
elements are
3
2
1
enter 1 to push ,2 to pop ,3 to display, -1 to exit
2
popped element=3
enter 1 to push ,2 to pop ,3 to display, -1 to exit
2
popped element=2
enter 1 to push ,2 to pop ,3 to display, -1 to exit
2
popped element=1
enter 1 to push ,2 to pop ,3 to display, -1 to exit
2
stack underflow
popped element=-9999
enter 1 to push ,2 to pop ,3 to display, -1 to exit
-1
*/
















			
	
