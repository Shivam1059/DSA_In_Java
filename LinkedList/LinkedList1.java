import java.util.Scanner;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList1{
    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Insert insertAtFront
    public void insertFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void insertAtend(int data){
        Node newNode = new Node(data);

        if(head == null){
            tail.next = head;
            head.next = tail;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void maxElement(int data){
       
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList1 list = new LinkedList1();

        list.insert(10);
        list.insert(20);
        list.insertFront(40);

        list.insertAtend(50);

        list.display();
    }

}