//right a program to check valid exprestion
import java.util.Scanner;

class Stack{
    private int top ;
    private int size;
    private char[] stack;

    public void push(char ch){
        if(top == size -1){
            System.out.println("Stack overflow");
            return ;
        }
        stack[++top] = ch;
    }

    public char pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }
        return stack[top--];
    }

       // Check empty
    public boolean isEmpty() {
        return top == -1;
    }
   
   public boolean checkExpression(String str){
     for(int i=0;i<str.length(); i++){
       char ch = str.charAt(i);
      if (ch == '(' || ch == '{' || ch == '['|| ch == ')' || ch == '}' || ch == ']') {
            push(ch);
      }
     }
      for(int i=0; i<str.length(); i++){
        
      }
   }
}

class Valid{
  public static void main(){
    Scanner sc = new Scanner(System.in);

    System.err.println("Enter the expression");
    String str = sc.nextLine();
   
    Stack s = new Stack();
    s.checkExpression(str);
  

   }
}