import java.util.Scanner;
class Test{
      private int size;
      private int front;
      private int rear;
      private int[] queue;

      public Test(int size){
        this.size = size;
        this.queue = new int[size];
        front = -1;
        rear = -1;
      }

    public void insert(int x){
        if(rear == size -1){
            System.out.println("Queue is overflow ");
            return;
        }
        if(front == -1 &&  rear == -1){
            front = rear = 0;
        }
        else{
            rear++;
        }
           queue[rear] = x;
    }
    public void delete(){
        if(front == -1 || front > rear ){
            System.out.println("queue is empty ");
            return;
        }
          System.out.println(" Delete  : "+queue[front]);
        if(front == rear){
           front = rear = -1;
        }
        else{
            front++;
        }
    }

    public void display(){
        if(front == -1 ||  front > rear){
            System.out.println("queue is empty");
            return;

        }
        for(int i=front; i<=rear; i++){
            System.out.println(queue[i]);
        }
    }
}
public class Code2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of queue : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Input invalid! Enter correct input : ");
            return;
        }

        Test t = new Test(size);
        t.insert(10);
        t.insert(20);
        t.insert(10);
        t.insert(20);
        t.insert(10);
        t.insert(20);
        
        t.display();


      t.delete();
    }
}