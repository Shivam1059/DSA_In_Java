import java.util.Scanner;
class CircularQueue
{
   char []CQueue;
   int size;
   int rear;
   int front;
   
   CircularQueue(int size)
   {
     this.size = size;
     CQueue = new char[size];
     rear = -1;
     front = -1;
   }
  
   void insert(char value)
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
     char temp;
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

public class CircularQueue3
{
   public static void main(String []args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("------QUEUE------");
	System.out.print("Enter the size of Queue : ");
	int size = sc.nextInt();
	
	CircularQueue cqueue = new CircularQueue(size);
	System.out.println("-------------------");
	cqueue.insert('A');
	cqueue.insert('b');
	cqueue.insert('C');
	cqueue.insert('D');
	cqueue.insert('E');
	System.out.println("-------------------");
	cqueue.display();
	System.out.println("-------------------");
	cqueue.delete();
	cqueue.delete();
	cqueue.delete();
	System.out.println("-------------------");
	cqueue.insert('X');
	cqueue.insert('Y');
	System.out.println("-------------------");
	cqueue.display();
	System.out.println("-------------------");
	cqueue.peek();
	System.out.println("-------------------");

 


   }
}