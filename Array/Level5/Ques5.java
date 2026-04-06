/*
Write a program to find the shortest word in a sentence using String.

input :"Java is fun and powerful"
output: Shortest word: "is"
*/


import java.util.Scanner;
class Ques5{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value : ");

    if(!sc.hasNextLine()) return;
     String input = sc.nextLine();
    
     int minValue = Integer.MAX_VALUE;

     int current  = 1;
    for(int i=0; i<input.length(); i++){
      char ch = input.charAt(i);
      current++;
      if(ch == ' '){
         minValue = Math.min(minValue, current);
         current = 0;
     }   
   }
    System.out.println("Value : "+minValue);
  }
}