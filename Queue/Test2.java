import java.util.*;

class IntQueue {
    int[] arr;
    int front, rear, size;

    IntQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    void insert(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        arr[++rear] = x;
        System.out.println("Inserted: " + x);
    }

    void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted: " + arr[front++]);
    }

    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    void countPrime() {
        int count = 0;
        for (int i = front; i <= rear; i++) {
            if (isPrime(arr[i])) count++;
        }
        System.out.println("Prime numbers count: " + count);
    }

    void countPerfect() {
        int count = 0;
        for (int i = front; i <= rear; i++) {
            if (isPerfect(arr[i])) count++;
        }
        System.out.println("Perfect numbers count: " + count);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue q = new IntQueue(10);

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Peek 4.Display 5.Count Prime 6.Count Perfect 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    q.insert(sc.nextInt());
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    q.countPrime();
                    break;
                case 6:
                    q.countPerfect();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}