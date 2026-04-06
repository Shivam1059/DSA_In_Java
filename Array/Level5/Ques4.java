/*
Write a program to remove all digits from a string and return the modified string using StringBuilder.

if (!sc.hasNextLine()) return; 
   String input = sc.nextLine();

input : "J4av1a P2rogramming"
output: "Java Programming"
*/

import java.util.Scanner;
class Ques4{

   public static boolean isChar(char x ){
       if(x >= '0' &&  x <= '9'){
         return false;
      }
     return true;
   }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the value : ");
      
 
      StringBuilder str = new StringBuilder(sc.nextLine());

      String result = "";
     for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(isChar(ch)){
          result += ch;
        }    
    }
   System.out.println("New update string :"+result);

  }
}