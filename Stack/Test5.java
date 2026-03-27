//count vowel and constant
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
        if(top == size-1){
            System.out.println("Stack is overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack is underflow");
        }
        return stack[--top];
    }


    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }

        for(int i=top; i>=0; i--){
            System.out.println(stack[i]);
        }
        System.out.println();
    }

    public int countVowel(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        int TotalCountVowel = 0;
        for(int  i=top; i>=0; i--){
            if(stack[i] == 'a' || stack[i]=='e' || stack[i] == 'i' || stack[i]=='o' || stack[i]== 'u'){
                TotalCountVowel++;
            }
       }
       return TotalCountVowel;
    }
    public int countConstant(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        int TotalCount = 0;
        for(int  i=top; i>=0; i--){
            if(stack[i] != 'a' && stack[i]!='e' && stack[i] != 'i' && stack[i] !='o' && stack[i] != 'u'){
                TotalCount++;
            }
       }
       return TotalCount;
    }
}



public class Test5{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string");
    String str = sc.nextLine();
    String newStr = str.toLowerCase();

    Stack s = new Stack(newStr.length());
    //push
    for(int i=0;i<newStr.length(); i++){
       s.push(str.charAt(i));
    }

    s.display();
    //countVowel
   System.out.println("Total vowle Count : "+s.countVowel());

   //countConstant
   System.out.println("Total constant count : "+s.countConstant());
   
    }
}