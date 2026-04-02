import java.util.*;

class Stack{
    private int top;
    private int size;
    private int[]stack;


   public Stack(int size){
    this.size = size;
    this.stack = new int[size];
    top = -1;
   }

   public void push(int x){
    if(top == size - 1){
        System.out.println("Stack is underflow");
        return;
    }
    top++;
    stack[top] = x;
   }

   public void pop(){
      if(top == -1){
        System.out.println("Stack in empty");
        return;
      }
      System.out.println("Delete : "+stack[top]);
      top--;
   }

   public void display(){
    if(top == -1){
        System.out.println("Stack is empty");
        return;
    }
    for(int i=top; i>= 0; i--){
        System.out.println(stack[i]);
    }
    System.out.println();
   }

   public void peek(){
     if(top == -1){
        System.out.println("Stack is empty");
        return;
     }
     System.out.println(" Peek : "+stack[top]);
   }
   
   
    
}

public class PreFix1{
    public static void main(String[] args){
       Scanner  sc = new Scanner(System.in);

       System.out.println("Enter the size of stack");
       int size = sc.nextInt();

     if(size <= 0){
        System.out.println("Input invalid! ");
     }

     Stack s = new Stack(size);
     s.push(20);
     s.push(30);
     s.push(40);
     s.push(50);

    s.peek();

    s.display();
    s.pop();
    
    s.peek();

    }
}