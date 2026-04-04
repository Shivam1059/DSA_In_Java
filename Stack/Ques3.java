import java.util.Scanner;
class Stack{
    private  int size;
    private int top;
    private char[]stack;

    public Stack(int size){
        this.size = size;
        this.stack = new char[size];
        top = -1;
    }

    public void push( char x){
        if(top == size -1){
            System.out.println("Stack is Overflow");
            return;
        }
        stack[++top] = x;
    }
    public char pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return '\0';
        }
       
        return stack[top--];
    }
    public char top(){
       if(top ==  -1) return '\0';
       return stack[top];
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }

   public boolean  isValidParenthes(String  str){
        Stack s = new Stack(str.length());

        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if(ch == '(' || ch == '{' || ch == '['){
              s.push(ch);
           }else{
              if(s.top == -1){
                 return false;
              }
            if((s.top() == '(' && ch == ')') ||
               (s.top() == '{' && ch == '}') ||
                 (s.top() == '[' && ch == ']')){
                s.pop();
              }else{  
                return false;
              }
           }
        }
        return s.top == -1;
   }
}

public class Ques3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "()[{}()]";


        Stack s = new Stack(str.length());
        s.display();
        
       System.out.println(  s.isValidParenthes(str));
    }
}