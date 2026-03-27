
import java.util.Scanner;

class Test{
    public void findFibonachi(int a){
        if( a < 0) return;
        
        int n1 = 0, n2 = 1;
        for (int i = 2; i < a; i++) {
               int n3 = n1 + n2;
               System.out.println(n3);
               n1 = n2;
               n2 = n3;
        }
    }

}

public class Fibonachi{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int n = sc.nextInt();
       Test t = new Test();
       t.findFibonachi(n);
    }
}