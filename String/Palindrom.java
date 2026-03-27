
import java.util.Scanner;

//chek number is palindrom
class Test{
    public boolean checkPalindrom(String str){
       int start = 0;
       int end = str.length()-1;
        
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


public class Palindrom{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
     
        String newStr = str.toLowerCase();

        Test t = new Test();
        System.out.println(t.checkPalindrom(newStr));
         
      }
}