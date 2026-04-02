
class Stack{
       private int top;
       private int size;
       private  int[] stack;
     

       public Stack(int size) {
           this.size = size;
           stack = new int [size];
           top = -1;
       }
       

       void push(int a){
         if(top == size-1){
            System.out.println("Stack Overflow");
            return;
         }else{
            top = top+1;
         }
       }
      
      int pop(){
        int y;
        if(top == -1 ){
            System.out.println("Stack underflow");
            return -1;
        }
          y = stack[top];
          top = top-1;
          return y;
      }
}

class Q1{
    public static void main(String arg[]){
      Stack s = new Stack();
      s.push();
   
     
    }
}