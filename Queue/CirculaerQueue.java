// WAP to reverse a Queue using a stack??

import java.util.Scanner;
class StackImpl
{
  int stack[];
  int size;
  int top;
  
  StackImpl(int size)
  {
    this.size = size;
    stack  = new int[size];
    top = -1;
  }

  int push(int value)
  {
	if(top == size-1)
	{
	  System.out.println("OverFlow");
	  return -1;
	}
		top++;
	return stack[top] = value;
  }

  int pop()
  {
	int val;
	if(top == -1)
	{
	  System.out.println("underFlow");
	  return -1;
	  
	}
	val = stack[top--];
	return val;
  }

  int peek()
  {
	
	if(top == -1)
	{
	  System.out.println("underFlow");
	  return -1;
	  
	}

	return stack[top];
  }

  void display()
  {
	if(top == -1)
	{
	  System.out.println("underFlow");
	  return;
	  
	}
	for(int i = top; i >= 0; i--)
	{
	  System.out.println(stack[i]);
	}

  }

  boolean isEmpty()
  {
	return top == -1;
  }

  int length()
  {
	return top + 1;
  }


}

public class CirculaerQueue
{
   int []CQueue;
   int size;
   int rear;
   int front;
   
   CirculaerQueue(int size)
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
   
   
   int delete()
   {
     int temp;
     if(front == -1)
     {
	System.out.println("Queue is Empty");
	return -1;
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

		return temp;
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

   public static void reverse(CirculaerQueue cqueue,StackImpl stack)
   {
  while(stack.top != cqueue.size -1)
  {
     stack.push(cqueue.delete());

  }
  
  while(!stack.isEmpty())
  {
     cqueue.insert(stack.pop());
  }

   }
   public static void main(String []args)
   {
  Scanner sc = new Scanner(System.in);
  System.out.println("------QUEUE REVERSE USING STACK------");
  
  StackImpl stack = new StackImpl(5);
  CirculaerQueue cqueue = new CirculaerQueue(5);
  System.out.println("-------------------");
  cqueue.insert(11);
  cqueue.insert(22);
  cqueue.insert(33);
  cqueue.insert(44);
  cqueue.insert(55);
  System.out.println("-------------------");
  cqueue.display();
  stack.display();
  System.out.println("-------------------");
  reverse(cqueue,stack);
  System.out.println("-------------------"); 
  cqueue.display();
  stack.display();
  


   }
}