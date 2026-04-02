//Reverse Stack Using Queue;
import java.util.*;
class Stack{
    private int size;
    private int   top;
    private int[] stack;

   public Stack(int size){
     this.size = size;
     this.stack = new  int[size];
     top = -1;
   }


   public void push(int x){
      if(top == size-1){
         System.out.println("Stack is overflow");
          return;
      }
      stack[++top] = x;
   }
   
   public int pop(){
     if(top == -1){
        System.out.println("Stack is underflow");
        return -1;
     }
     System.out.println("Delete element : "+stack[top]);
      return stack[top--];
   }
   
   public void display(){
     if(top == -1){
        System.out.println("Stack is empty");
         return ;
      }
     for(int i=top; i>=0; i--){
         System.out.println(stack[i]);
      }
   }

}

class Queue{
    int size;
    int rear , front ;
    int [] queue;

   public Queue(int size){
    this.size  = size;
    this.queue = new int[size];
    rear = -1;
    front = -1;
   }
   
   public void insert(int x){
      if(front == size -1 || front > rear){
         System.out.println("Queue is overflow");
          return;
      }
      else if(front == -1 && rear == -1){
             front = rear = 0;
         }
       rear++;
       queue[rear] = x;
   }

   public int delete(){
      if(front == -1){
         System.out.println("Queue is underflow");
         return -1;
      }
      else if( front == rear){
           front = -1;
           rear  = -1;
      }
     return queue[front--];
   }

}

public class ReverseStack{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of stack : ");
      int size = sc.nextInt();
     
      if(size <= 0){
         System.out.println("Input is invalid!");
          return;
      }

      Stack s = new Stack(size);
      Queue q = new Queue(size);
      s.push(10);
      s.push(20);
      s.push(30);      
      
      s.display();
      q.insert(s.pop());
      q.insert(s.pop());
      q.insert(s.pop());
      
      s.push(q.delete());
      s.push(q.delete());
      s.push(q.delete());
      
      s.display();
      
    }

}