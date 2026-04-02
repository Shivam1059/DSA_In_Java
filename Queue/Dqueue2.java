
import java.util.*;

class Dqueue{
    private int size;
    private int front;
    private int rear;
    private int[] dqueue;

    public Dqueue(int size){
        this.size = size;
        this.dqueue = new int[size];
        front = -1;
        rear = -1;
    }

    public void inserFront(int x){
        if((front == 0 && front == size -1) || (front == rear+1)){
            System.out.println("Dqueue is Overflow");
            return;
        }
        if(front == -1 && rear == -1){
            front = rear = 0;
        }
        else{
            front = (front - 1 + size)%size;
        }
        dqueue[front] = x;
    }

    public void inserRear(int x){
        if((front == 0 && front == size -1)|| (front == rear + 1)){
            System.out.println("Dqueue is Overflow");
            return;
        }
        if(front == -1){
            front = rear = 0;
        }
        else{
            rear = (rear + 1)%size;
        }
        dqueue[rear] = x;
    }

    public void deleteFront(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Delete : "+dqueue[front]);
        if(front == rear){
          front = rear = -1;
        }
        else{
            front = (front +1)% size;
        }
    }
    public void deleteRear(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Delete : "+dqueue[rear]);
        if(front == rear){
            front = rear = -1;
        }
        else{
            rear = (rear - 1)%size;
        }
    }

    public void display(){
        if(front == -1){
            System.out.println("Queue is empty ");
            return;
        }
        int i = front;
        while(true){
            System.out.println(dqueue[i] + " ");
            if(i == rear) break;
            i = (i + 1)%size;
        }
    }

 
}


public class Dqueue2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Dqueue : ");
        int size = sc.nextInt();
        
        if(size <= 0) System.out.println("Input is invalid! ");

        Dqueue dq = new Dqueue(size);

        dq.inserRear(20);
        dq.inserFront(30);
        dq.inserFront(40);
        dq.inserFront(50);

        dq.inserRear(78);
        dq.inserRear(45);
        
        dq.deleteFront();
        dq.display();
       
    }
}