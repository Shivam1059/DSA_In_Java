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
     
     String newStr = "";
     for(int i=0; i<str.length(); i++){
         for(int j=0; j<str.length(); j++){
           if(str.charAt(i) != str.charAt(j)){
                if(
           }
        }
     }
     
  System.out.println("New update String : "+newStr); 
  }
}