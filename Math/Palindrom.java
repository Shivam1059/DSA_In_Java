
import java.util.Scanner;

class Test{
    public boolean checkPalindrom(int num){
        int previse = num;
        int reverse = 0;
        while(num > 0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
             num = num/10;
        }
        if(previse == reverse){
            return true;
        }
        return false;
    }
}


public class Palindrom{
    public  static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Test t = new Test();
        if(t.checkPalindrom(n)){
            System.out.println("Number is Palindrom");
        }else{
             System.out.println("Number is not  Palindrom");
        }
    }
}