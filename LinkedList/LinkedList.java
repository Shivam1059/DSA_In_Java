class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next  = next;
    }
}


class LinkedList{
    Node head;

    public void insertAtFront(int data){
     Node newNode = new Node(data);

     newNode.next = head;
     head = newNode;
    }
    public void  insert(int data){
        Node newNode = new Node(data);
         
         if(head == null){
            head = newNode;
            return;
         }      
       Node temp = head;
         while(temp.next != null){
            temp = temp.next;
         }

         temp.next = newNode;
    }

     public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public boolean findElement(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                 return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
        System.out.println(list.findElement(30));
    }
}