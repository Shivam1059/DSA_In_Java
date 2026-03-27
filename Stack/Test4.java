//check String is palindrom or not
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
         if(top == size - 1){
            System.out.println("stack overflow");
            return;
         }
         stack[++top] = value;
    }

    public char pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return '\0';
        }
        return stack[top--];
    }

    public boolean isPalindrom(String str){
        int n  = str.length();
        for(int i=0; i<n; i++){
            push(str.charAt(i));
        }

        for(int i=0; i<n; i++){
            if(str.charAt(i) != pop()){
                return false;
            }
        }
        return true;
    }
}

public class Test4{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str =  sc.nextLine();

        Stack s = new Stack(str.length()); 

      if((s.isPalindrom(str))){
          System.out.println("String is Palindrome");
      } else {
          System.out.println("String is NOT Palindrome");
      }
      
      }
}