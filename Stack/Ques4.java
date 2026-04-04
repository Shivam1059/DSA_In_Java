class Stack{
    private int size;
    private int top;
    private char[] stack;
    
    public Stack(int size){
        this.size = size;
        this.stack = new char[size];
        top = -1;
    }

    public void push(char x){
        if(top == size -1){
            System.out.println("Stack is overflow");
            return;
        }
        stack[++top] = x;
    }
    
    public int pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return-1;
        }
        return stack[top--];
    }

    public char peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return '\0';
        }
        return stack[top];
    }

     public boolean isEmpty() {
        return top == -1;
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

    public boolean chechParenth(String str){
        Stack s = new Stack(str.length());

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('|| ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(peek() == -1){
                    return false;
                }
                else if((s.pop() == '(' && ch == ')') ||
                    (s.pop() == '{' && ch == '}' ) ||
                    (s.pop() == '[' && ch == ']') )
                {
                  s.pop();
                }else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}

public class Ques4{
    public static void main(String[] args) {
        String str = "({[]})";

        Stack s = new Stack(str.length());  
       System.out.println( s.chechParenth(str));
    }
}