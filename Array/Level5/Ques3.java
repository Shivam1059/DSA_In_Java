/*
Remove all duplicate characters from a string and return the modified string using StringBuilder.

input :"programming"
output: "progamin"
 
*/
import java.util.*;
class Ques3{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the string : ");
     StringBuilder str = new StringBuilder(sc.nextLine());
     
     Set<Character> set = new HashSet<>();
     String newStr = "";
     for(int i=0; i<str.length(); i++){
         set.add(str.charAt(i));
      }
     
    for(char c : set){
         newStr += c;
    }
        System.out.println("New update String : "+newStr); 
  }
}