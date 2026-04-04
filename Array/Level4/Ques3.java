/*
You're developing a data analysis feature for a math competition platform. Teachers upload a 2D array of student scores from practice tests. The platform wants to highlight perfect numbers within this array—numbers where the sum of their proper divisors equals the number itself (e.g., 6, 28).

Your job is to write a Java program that:

Finds all the perfect numbers in the 2D array.

Counts them.

Displays the total number of perfect scores  */

import java.util.Scanner;
class Test{
   public static boolean checkPerfectNumber(int x){
      int sum = 0;
      int i = 1;
      while( i <= x/2){
         if(x % i == 0){
            sum += i;
         }
        i++;
      }
      if(sum == x){
        return true;
      }else{
       return false;
      }
   }
}
public class Ques3{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    
   System.out.println("Enter the row : ");
   int row = sc.nextInt();
   
   if(row <= 0){
     System.out.println("Input is invalid!");
     return;
   }
   
   System.out.println("Enter the col : ");
   int col = sc.nextInt();

   if(col <= 0){
    System.out.println("Input is invalid!");
    return;
   }

   int[][] arr = new int[row][col];

   for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
     System.out.println("Enter the element : ");
          arr[i][j] = sc.nextInt();
       }
   }
   
   int countPerfectNum = 0;

   for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        int num = arr[i][j];
        System.out.print(num +" ");

       if(Test.checkPerfectNumber(num)){
          countPerfectNum++;
       }

    }
     System.out.println();
  }
  
  System.out.println("Total PerpectNumber : "+countPerfectNum);
       
  }
}