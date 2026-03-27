
import java.util.Scanner;

class Test{
    public boolean checkPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }   
}

public class Prime{
    public static void main(String[]  args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number : ");
     int n = sc.nextInt();
     Test t = new Test();

     System.out.println(n +(t.checkPrime(n) ? " Prime number " : "not Prime number"));
    }
}