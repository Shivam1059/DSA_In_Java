import java.util.Scanner;

class Queue{
      private int size ;
      private int  front  = -1;
      private int rear = -1;
      int[] queue;

      public Queue(int size){
        this.size = size;
        this.queue = new int[size];
      }

      public void insert(int x){
          if(rear == size -1){
            System.out.println("Queue is overflow");
            return;
          }
          if(front == -1 && rear == -1){
            front = rear = 0;
          }
          else{
             rear++;
          }
          queue[rear] = x;
          System.out.println("Element "+x+" inserted ");
      }

      public void delete(){
        if(front == -1  ||front > rear){
            System.out.println("Queue is empty ");
            return;
        }
        System.out.println("Deleted "+queue[front] );
        
            if(front == rear){
                front = rear = -1;
            }else{
              front++;
            }          
        }

      public void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return ;
        }
        for(int i=front; i<=rear; i++){
            System.out.println(queue[i]);
        }
      }

}

public class Code1{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Invalid input! Enter the correct size :  ");
            return;
        }
        

        Queue q = new Queue(size);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);

        q.display();


        q.delete();
      }
}