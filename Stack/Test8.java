//stack reverse
import java.util.Scanner;

class  Stack{
    private int top;
    private int size;
    private  int[] stack;

    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value){
       if(top == size -1){
        System.out.println("Stack overflow");
        return ;
       }
       stack[++top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }
 
  public boolean isEmpty(){
    return top == -1;
  }
    public void display(){
       if(top == -1){
        System.out.println("stack is empty");
        return;
       }

       for(int i=top; i>=0; i--){
          System.out.println(stack[i]);
       }
       System.out.println();
    }

}


public class Test8{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of stack");
        int size = sc.nextInt();
        
        Stack s1 = new Stack(size);
        Stack s2 = new Stack(size);
        Stack s3 = new Stack(size);
        Stack s4 = new Stack(size);
    

        for(int i=0; i<size; i++){
           System.out.println("Enter the element "+i+": ");
           int element = sc.nextInt();
           s1.push(element);
        } 

        System.out.println("Original stack : ");
        s1.display();

        //s1 -> s3
        while(!s1.isEmpty()){
            s3.push(s1.pop());
        }

        while(!s3.isEmpty()){
            s4.push(s3.pop());
        }

       while(!s4.isEmpty()){
           int temp = s4.pop();
           s1.push(temp);
           s2.push(temp);
        }
      
       System.out.println("copy Stack:");
       s2.display();
     
        System.out.println("Original Stack after copy:");
        s1.display();
    }

}