import java.util.*;
class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        
        StringBuilder newStr = new StringBuilder(str);
        int start = 0, end = str.length()-1;
        while(start < end){

           char temp = newStr.charAt(start);
           newStr.setCharAt(start,  newStr.charAt(end));
           newStr.setCharAt(end, temp);

           start++;
           end--;
        }
        System.out.println(newStr);
    }
}