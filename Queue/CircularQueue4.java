import java.util.Scanner;
class CircularQueue
{
   int []CQueue;
   int size;
   int rear;
   int front;
   
   CircularQueue(int size)
   {
     this.size = size;
     CQueue = new int[size];
     rear = -1;
     front = -1;
   }
  
   void insert(int value)
   {
     if((front == 0 && rear == size-1) || (front == rear + 1))
     {
	System.out.println("Queue is full");
	return;
     }
    
     if(front == -1)
     {
	front = 0;
     }

     if(rear == size -1)
     {
	rear = 0;
     }

     else
     {
	rear = rear + 1;
     }

	CQueue[rear] = value;
   }
   
   
   void delete()
   {
     int temp;
     if(front == -1)
     {
	System.out.println("Queue is Empty");
	return;
     }

     temp = CQueue[front];

     if(front == rear)
     {
	front = -1;
	rear = -1;
     }

     else if(front == size - 1)
     {
	front = 0;
     }

     else
     {
	front  = front + 1;
     }

	System.out.println("Deleted element is "+temp);
   }

   void display()
   {
     if(front == -1)
     {
	System.out.println("Queue is Empty");
	return;
     }
	int i = front;
     if(front <= rear)
     {
	while(i <= rear) 
        {
	   System.out.println(CQueue[i]);
	   i++;
  	}
     }

     else
     {
  	while(i <= size -1)
	{
	   System.out.println(CQueue[i]);
	   i++;
	}
	 i = 0;
	while(i <= rear)
	{
	  System.out.println(CQueue[i]);
	  i++;
	}
     }

   }

   void peek()
   {
     if(front == -1)
     {
	System.out.println("Queue is Empty");
	return;
     }

	System.out.println("peek element is "+CQueue[front]);
   }

}

public class CircularQueue4
{
   public static void main(String []args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("------QUEUE------");
	System.out.print("Enter the size of Queue : ");
	int size = sc.nextInt();
	
	CircularQueue cqueue = new CircularQueue(size);
	cqueue.insert(10);
	cqueue.insert(20);
	cqueue.insert(30);
	cqueue.insert(40);
	cqueue.insert(50);
	cqueue.display();
	cqueue.delete();
	cqueue.delete();
	cqueue.delete();
	cqueue.insert(600);
	cqueue.insert(550);
	cqueue.display();

 


   }
}