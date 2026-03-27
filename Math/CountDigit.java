import java.util.Scanner;
class Test{

      public void countDigit(int num){
            String str = "";
            int sum = 0;
            while(num > 0){
                  int lastDigit = num%10;
                  str += lastDigit;
                  sum += lastDigit;
                  num = num/10;
            }
            int newNumber = Integer.parseInt(str);
            System.out.println("Sum : "+sum);
            System.out.println("Reverse number : "+newNumber);
      } 

}

public class CountDigit{
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number : ");
           int num = sc.nextInt();
           
           Test t = new Test();
           t.countDigit(num);
      }
}