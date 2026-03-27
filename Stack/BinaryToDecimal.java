import java.util.Scanner;
class Stack{
      private int top ;
      private int size;
      private int[] stack;


      public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
      }
      
      public void push(int value){
        if(top == size -1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
      }

      public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
      }
      
     public boolean isEmpty() {
        return top == -1;
    }
    public void decimalTobinary(int n){
        while (n > 0) {
            push(n % 2);
            n = n / 2;
        }

       System.out.print("Binary number: ");
        while (!isEmpty()) {
            System.out.print(pop());
        }
    }

}

class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer : ");
        int num = sc.nextInt();
       
        Stack s = new Stack(5);
        s.decimalTobinary(num);
        
    }
}