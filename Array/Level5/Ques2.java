/*
. Write a program to find the first non-repeated character in a string using StringBuffer or StringBuilder.
input :"swiss"
output :The first non-repeated character is: "w"

Explanation: The program uses StringBuffer to track character counts and returns the first character that occurs only once in the string.

*/
import java.util.*;
class Ques2{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      
     System.out.println("Enter the String : ");
     StringBuilder str  = new StringBuilder(sc.nextLine());
     
    for(int i=0; i<str.length(); i++){
       int count = 0;
       char ch = '\0';
       for(int j=0; j<str.length(); j++){
         if(str.charAt(i) == str.charAt(j)){
            count++;
            ch = str.charAt(i);
         }
      }
         if(count == 1){
          System.out.println("Uniqec Char : "+ch);
          return;
         }
    }
     
     }
}  