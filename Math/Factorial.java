
import java.util.Scanner;

class Test{
    public long findFactorial(int num){
         if(num < 0) return -1;
         long result = 1;
         for(int i=2; i<=num; i++){
            result *= i;
         }
         return result;
    }
}

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        
        Test t = new Test();
       System.out.println("Factorial NUM : "+ t.findFactorial(n));
    }
}