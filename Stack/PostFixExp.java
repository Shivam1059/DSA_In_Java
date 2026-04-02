class PostFixExp {
    
    int stack [];
    int size ;
    int top ;
    PostFixExp(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int a){
        if (top == size - 1) {
            System.out.println("overflow");
            return;
        }
        top = top + 1;
        stack[top] = a;
        System.out.println("inserted :" +a);

    }
    int pop(){
        if (top ==  -1) {
            System.out.println("underflow");
            return -1;
        }
        int y = stack[top];
        top = top -1;
        return y;

    }


     int peek(){
        if (top == -1) {
            System.out.println("underflow");
            return -1;
        }
       
        return stack[top];
    }
    
     void display(){
        if (top == -1) {
            System.out.println("underflow");
            return ;
        }
       for(int i = top;i>=0;i--)
        System.out.println(stack[i]);
    }

    public static void main(String[] args) {
        
        String str = "92-7/2";
        PostFixExp p = new PostFixExp(str.length());

    
        int l = str.length()-1;
        for(int i =0;i<= str.length()-1;i++){
            char temp = str.charAt(i);
            if(temp >='0' && temp <='9'){
            p.push(Integer.parseInt(String.valueOf(temp)));
            }
            else{
                int a = p.pop();
                int b = p.pop();
                switch (temp) {
                    case '+':
                        p.push(a + b);
                        System.out.println(a+"+"+b);
                        break;
                    case '-':
                        p.push(b - a);
                        break;
                    case '*':
                        p.push(a * b);
                        break; 
                    case '/':
                        p.push(b / a);
                        break;       
                    default:
                        break;
                }
            }
        }
       
    if (p.top != 0) {
    System.out.println("Invalid Expression");
} else {
    System.out.println("result :" + p.pop());
}
    }
}


