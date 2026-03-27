import java.util.Scanner;

class Palindrome{
     public static boolean isPalindrome(String str){
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
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

       if(isPalindrome(str)){
         System.out.println("It is a Palindrome");
       }else{
        System.out.println("It is not a Palindrome");
       }

       sc.close();
        
    }
}