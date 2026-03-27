import java.util.*;

class CharQueue {
    char[] arr;
    int front, rear, size;

    CharQueue(int size) {
        this.size = size;
        arr = new char[size];
        front = rear = -1;
    }

    void insert(char x) {
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

    boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    void countVowels() {
        int count = 0;
        for (int i = front; i <= rear; i++) {
            if (isVowel(arr[i])) count++;
        }
        System.out.println("Vowels count: " + count);
    } 

    void countConsonants() {
        int count = 0;
        for (int i = front; i <= rear; i++) {
            if (!isVowel(arr[i]) && Character.isLetter(arr[i])) count++;
        }
        System.out.println("Consonants count: " + count);
    }

    void search(char key) {
        for (int i = front; i <= rear; i++) {
            if (arr[i] == key) {
                System.out.println("Character found in queue");
                return;
            }
        }
        System.out.println("Character NOT found");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharQueue q = new CharQueue(10);

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Vowels 5.Consonants 6.Search 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter char: ");
                    q.insert(sc.next().charAt(0));
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.countVowels();
                    break;
                case 5:
                    q.countConsonants();
                    break;
                case 6:
                    System.out.print("Enter char to search: ");
                    q.search(sc.next().charAt(0));
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}