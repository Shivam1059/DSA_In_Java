
import java.util.Scanner;

class Stack {

    private int size;
    private int top;
    private int[] stack;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return -1;
        }
        System.out.println("Delete : " + stack[top]);
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public void printEven() {
        for (int i = top; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(" " + stack[i]);
            }
        }
    }

    public boolean isPrime(int num) {
        int j = 2;
        while (j < num / 2) {
            if(num <= 1){
                return false;
            }
            if (num <= 3) {
                return true;
            } else if (num % j == 0) {
                return false;
            } 
             j++;
        }
        return true;
    }


    public void printPrime() {
        for (int i = top; i >= 0; i--) {
            int num = stack[i];
            if(isPrime(num)){
                System.out.println("Prime : "+num);
            }else{
                System.out.println("Not Prime : "+num);
            }
        }
    }
}

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack : ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Input is invalid!");
            return;
        }

        Stack s = new Stack(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element : ");
            s.push(sc.nextInt());
        }

        System.out.println("Stack : ");
        s.display();
        System.out.println("Even number stack : ");
        s.printEven();
        System.out.println();

        System.out.println("Prime number and not prime number in stack : ");
        s.printPrime();
    }
}
