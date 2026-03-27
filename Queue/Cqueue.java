import java.util.Scanner;

class Queue{
     int size;
     int front ;
     int rear ;
     int[] queue;

    public Queue(int size){
        this.size = size;
        this.queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void insert(int x){
        if((rear+1)%size == front){
            System.out.println("Cqueue is Overflow ");
            return;
        }
        if(rear == -1 && front == -1){
            front = rear = 0;
            queue[rear] = x;
        }
        else{
            rear = (rear+1)%size;
            queue[rear] = x;
        }
    }

    public void delete(){
        if(front == -1){
            System.out.println("Cqueue is empty");
            return;
        }
        System.out.println("Delete  : "+queue[front]);
        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front+1)%size;
        }
    }

    public void display(){
        if(front == -1 ){
            System.out.println("Cqueue is empty");
            return;
        }

         int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class Cqueue{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Cqueue : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid input! Enter correct  size  : ");
            return;
        }

        Queue q = new Queue(size);
        q.insert(20);
        q.insert(30);
        q.insert(45);

        q.display();

        q.delete();
     }
}