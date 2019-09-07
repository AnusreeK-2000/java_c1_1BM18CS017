import java.util.*;
class Queue
{
	int front,rear,q[];
	Queue()
	{
		front=0;
		rear=0;
		
	}
	Queue(int size)
	{
		front=0;
		rear=-1;
		q=new int[size];
	}
	void insert(int item)
	{
		if(rear==q.length)
		{
			System.out.println("queue overflow");
			return;
		}
		
			q[++(rear)]=item;
		
	}
	int delete()
	{
		if(front==rear)
		{
			System.out.println("queue underflow");
			return -999;
		}
		else
			return q[(front)++];
	}
	void display()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
		}
		else
		{
			System.out.println("contents of queue are");
			for(int i=front;i<=rear;i++)
				System.out.println(q[i]);
		}
	}
}
class QueueDemo
{
	
	public static void main(String args[])
	{
		System.out.println("enter the size of the queue");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		Queue qu=new Queue(s);
		System.out.println("enter 1 to insert\n2 to delete\n3 to display\n-1 to exit");
		int ch=sc.nextInt();
		while(ch!=-1)
		{
			switch(ch)
			{
				case 1:System.out.println("enter the no.of elements to be inserted");
					int n=sc.nextInt();
					System.out.println("enter the elements to be inserted");
					for(int i=0;i<n;i++)
					{
						int it=sc.nextInt();
						qu.insert(it);
					}
					break;
				case 2:System.out.println("deleted element is"+qu.delete());
					break;
				case 3:qu.display();
					break;
				default:System.out.println("invalid input");
			}
			System.out.println("enter next choice or -1 to exit");
			ch=sc.nextInt();
		}
	}
}
