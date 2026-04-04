/*
1 . Replace all occurrences of a character in a string with another character.
*/

import java.util.*;
class Ques1{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the String : ");
     String str = sc.nextLine();
     System.out.println("Old String : "+str);

     char[] arr = str.toCharArray();
     
      String newStr = "";

    System.out.println("Enter the char : ");
     char ch = sc.next().charAt(0);

    System.out.println("Enter the char that you want to replace : ");
     char newCh = sc.next().charAt(0);


    for(int i=0; i<arr.length; i++){
      if(arr[i] == ch){
         arr[i] = newCh;
      }
   }
    
    for(char c : arr){
       newStr += c;
    }
   System.out.println("New update String : "+newStr);
  }
}