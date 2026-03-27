import java.util.*;
class Dqueue{
    public  int size;
    public  int front;
    public  int rear ;
    public  int[] dqueue;

     public Dqueue(int size){
        this.size = size;
        this.dqueue = new int[size];
        front = -1;
        rear = -1;
     }

     //insertion form rear
     public void insert(int x){
        if((rear + 1) % size == front){
            System.out.println("dqueue is overflow ");
            return;
        }
        if(front == -1 && rear == -1){
            front = rear = 0;
        }
        else{
          rear = (rear + 1) % size;
        }
         dqueue[rear] = x;
     }
    
    //insert fron front 
    public void insertFront(int x){
        if((rear == size -1 && front == 0) || (front == rear + 1)){
            System.out.println("Dqueue is Overflow");
            return;
        }
        if(front == -1){
            front = rear = 0;
        }
        else{
            front = (front - 1 + size)%size;
        }
        dqueue[front] = x;
    }
//deletion from front
     public void delete(){
        if(front == -1 ){
            System.out.println("Dqueue is empty");
            return;
        }
        System.out.println("delete : "+dqueue[front]);
        if(front == rear){
            front = rear = -1;
        }
        else{
          front = (front + 1) % size;
        }
     }

//delete from rear
   public void deleteRear(int x){
     if(front == -1 ){
       System.out.println("Queue is empty");
       return;
     }
     if(front == rear){
        front = rear = -1;
     }
     else{
        rear = (rear - 1 + size)% size;
     }
   }



   //display
   public void display(){
    if(front == -1){
        System.out.println("Queue is empty");
        return;
    }
  int i = front;
        while (true) {
            System.out.print(dqueue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
   }
}

public class Dqueue1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Input invalid!");
            return;
        }

        Dqueue d = new Dqueue(size);
        d.insert(10);
        d.insert(20);
        d.insertFront(40);
        d.insertFront(50);

        d.display();
        d.delete();
    }
}