
import java.util.Scanner;

class Test{
    public void checkEvenorOdd(int num){
      //if(num % 2 == 0){
       if((num & 1) == 0){
         System.out.println("Even ");
       }else{
        System.err.println("Odd");
       }
    }
}

public class EvenOdd{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = sc.nextInt();
       Test t = new Test();
       t.checkEvenorOdd(num);

   }
}