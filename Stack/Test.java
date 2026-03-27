class Stack{
    private int top;
    private int size;
    private int[] stack;


    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top == size-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
    }
    public int pop(){
        if(top == -1){
            System.out.println("stack underflow");
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
            System.out.println("stack is empty");
        }
            for(int i = top ; i>= 0; i--){
                System.out.println(stack[i]);
            }
         System.out.println();
    }
}

class Test{
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.display();
        System.out.println("Pop: "+s.pop());
        System.out.println("Top element : "+s.peek());
    }
}

