//simple stack 

import java.util.Scanner;
class Stack{
    private int  size;
    private int top ;
    private int[] stack;

    public Stack(int size){
        this.size = size;
        this.stack = new int[size];
        top = -1;
    }

    public void push(int x){
        if(top == size-1){
            System.out.println("Stack is overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }
        System.out.println("Delete : "+stack[top]);
        return stack[top--];
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return ;
        }
        for(int i= top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}

public class Ques1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of stack : ");
    int size = sc.nextInt();
    if(size <= 0){
        System.out.println("Input is invalid!");
    }

    Stack s = new Stack(size);
    for(int i=0; i<size; i++){
        System.out.println("Enter the element "+i);
        s.push(sc.nextInt());
    }

    s.display();

    s.pop();

    s.display();
  }
}