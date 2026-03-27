//reverse String using Stack

import java.util.Scanner;
class Stack{
    private int top;
    private int size;
    private char[] stack;

    public Stack(int size){
        this.size = size;
        stack = new char[size];
        top = -1;
    } 

    public void push(char value){
         if(top == size -1 ){
            System.out.println("Stack in overflow");
            return;
         }
         stack[++top] = value;
    }  

    public char pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return '\0';
        }
       return stack[top--];
    }

    public char peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return '\0';
        }
        return stack[top];
    }
    
    public String reverse(){
        
        StringBuilder result = new StringBuilder();
         while(top != -1){
            result.append(pop());
         }
        return result.toString();
    }
}

class Test3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the string");
        String str = sc.nextLine();


        int n = str.length();
        Stack s = new Stack(n);

        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            s.push(ch);
        }
        System.out.println("Reversed String : "+s.reverse());
        

    }
}