
import java.util.Scanner;

class Test{
  //using recurtion
  //  public int checkHCR(int a, int b){
  //     if(b == 0) return a;
  //     return checkHCF(b, a%b);
  //  }
    public int checkHCF(int a, int b){
    
        while(b != 0){
          int temp = b;
          b = a % b;
          a = temp;
        }
        
        return a;
    }

    public int checkLCM(int a, int b){
       return (a * b)/(checkHCF(a, b));
    }
    
}

public  class LCMHCF{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a"); 
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();

        Test t = new Test();
         System.out.println( "HCF : "+t.checkHCF(a, b));

         System.out.println("LCM : "+t.checkLCM(a, b));
      }
}