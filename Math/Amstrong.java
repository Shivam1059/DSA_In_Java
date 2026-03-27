
import java.util.Scanner;

class Test{
    public boolean checkAmstrongNumber(int num){
       int reverse = num;
       int amstrong = 0;
       while(num > 0){
          int digit = num%10;
          int n = digit*digit*digit;
          amstrong = amstrong + n;
          num = num/10;
       }
       if(reverse == amstrong){
         return true;
       }
       return false;
    }
}


public class Amstrong{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        Test t = new Test();
        if(t.checkAmstrongNumber(num)){
            System.out.println(num + "  Amstrong number ");
        }else{
              System.out.println(num + " Not Amstrong number ");
        }
    }
}