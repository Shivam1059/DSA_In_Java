
class  PrefixExp {
    int stack [];
    int size ;
    int top ;
    PrefixExp(int size){
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

        //Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        String str = "+92";
       // System.out.println(" enter size of stack");
        PrefixExp p = new PrefixExp(str.length());

    
        int l = str.length()-1;
        for(int i = str.length()-1;i>=0;i--){
            char temp = str.charAt(i);
            if(temp >='0' && temp <='9'){
            p.push(Integer.parseInt(String.valueOf(temp)));
            }
            else{
                int a = p.pop();
                int b = p.pop();
                switch (temp) {
                    case '+':
                        p.push(a+b);
                        break;
                    case '-':
                        p.push(a-b);
                        break;
                    case '*':
                        p.push(a*b);
                        break; 
                    case '/':
                        p.push(a/b);
                        break;       
                    default:
                        break;
                }
            }
        }
        System.out.println(" result :"+p.pop());
    }
}
