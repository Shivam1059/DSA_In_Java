import java.util.Scanner;

class Queue {
    int[] queue;
    int size;
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.queue = new int[size];
    }

    void insert(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {   
            front = 0;
        }

        rear++;
        queue[rear] = x;
    }

    void delete() {   
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        int y = queue[front];
        front++;
        System.out.println("Deleted: " + y);
    }

    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue: ");
        int n = sc.nextInt();

        Queue q = new Queue(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            int j = sc.nextInt();
            q.insert(j);
        }

        q.display();
        q.delete();
        q.peek();
        q.display();
    }
}