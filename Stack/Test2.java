//stack
class Stack{
    private int size;
    private int top;
    private int[] stack;


    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }


    public void push(int value){
        if(top == size -1){
             System.out.println("Stack overflow");
             return;
        }
        stack[++top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
       return stack[top--];
    }
    
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
        
    }
   public void display(){
        if(top == -1){
          System.out.println("Stack is empty");
        }
       for(int i= top ; i>=0; i--){
        System.out.println(stack[i]);
       }
       System.out.println();
   }
}

class Test2{
    public static void main(String[] args) {
        Stack s = new Stack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
    

        s.display();
        System.out.println("Pop : "+ s.pop());
     
        System.out.println("Top : "+s.peek());
    }
}
