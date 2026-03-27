//count odd and even and sum
import java.util.Scanner;

class Stack{
    private int top;
    private int size;
    private int[]  stack;

    public Stack(int  size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value){
       if(top == size - 1){
        System.out.println("Stack overflow");
        return;
       }
       stack[++top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack is underflow");
            return -1;
        }
      return  stack[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void countEvenandOdd(){
       int countEven = 0;
       int countOdd = 0;
       int totalSum  = 0;
       for(int i=top ; i>= 0; i--){
          totalSum += stack[i];
           int num = stack[i];
           if(num%2 == 0){
             countEven++;
           }else{
            countOdd++;
           }
       }
       System.out.println("Total countEven : "+countEven);
       System.out.println("Total countOdd :  "+countOdd);
       System.out.println("Total sum : "+totalSum);
       
    }
}

class Test6{

    public static void main(String[] args){
       Scanner sc  = new Scanner(System.in);

       System.out.println("Enter size of stack");
       int size = sc.nextInt();

       Stack s = new Stack(size);
       for(int i=0; i<size; i++){
        System.out.println("Enter the element : "+i);
        int element = sc.nextInt();
           s.push(element);
       }

      //even&odd
      s.countEvenandOdd();
 
    }
}