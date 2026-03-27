import java.util.Scanner;
class Test{
    public int reverDigit(int num){
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse*10 + digit;
             num = num / 10;
        }
        return reverse;
    }

}

class ReverseDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        Test t = new Test();
       System.out.println( "Reverse digit : "+t.reverDigit(num));
        
    }
}