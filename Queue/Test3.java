import java.util.*;

class Queue {
    int size, front, rear;
    int[] queue;  

    public Queue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];  
    }

    public void insert(int x) {
        if (rear == size - 1) {   
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;

        queue[++rear] = x;
        System.out.println("Inserted: " + x);
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element: " + queue[front++]);
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println("Element: " + queue[i]);
        }
        System.out.println();
    }
    public void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        }
        System.out.println("Queue is peek element : "+queue[front]);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        Queue q = new Queue(size);  

        System.out.println("Enter element: ");
        int element = sc.nextInt();

        q.insert(element);
        q.display();
    }
}