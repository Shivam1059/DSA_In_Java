// WAP to read two 2-D array elements from user and find sum of that two array in third array //and display elements of that third array.

import java.util.Scanner;

public class Ques5{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the row size : ");
     int row = sc.nextInt();

     if(row <= 0){
      System.out.println("Input is invalid");
      }
     
     System.out.println("Enter the col size : ");
      int col = sc.nextInt();
     
     if(col <=0){
       System.out.println("Input is invalid");
     }
     
     int[][] arr1 = new int[row][col];
     for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.println("Enter the element : ");
             arr1[i][j] = sc.nextInt();
         }
      }

     System.out.println("2 array for : ");
     

     System.out.println("Enter the row size : ");
     int row1 = sc.nextInt();

     if(row1 <= 0){
      System.out.println("Input is invalid");
      }
     
     System.out.println("Enter the col size : ");
      int col1 = sc.nextInt();
     
     if(col1 <=0){
       System.out.println("Input is invalid");
     }
      int[][] arr2 = new int[row1][col1];
      for(int i=0; i<row1; i++){
        for(int j=0; j<col1; j++){
            System.out.println("Enter the element : ");
             arr2[i][j] = sc.nextInt();
         }
      }

       
      System.out.println("Array first 2-d array : ");
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
           System.out.print(arr1[i][j]+" "); 
         }
         System.out.println();
      }
       
       System.out.println("Array second 2-d array : ");
       for(int i=0; i<row1; i++){
        for(int j=0; j<col1; j++){
           System.out.print(arr2[i][j]+" "); 
         }
           System.out.println();
      }
  
     
     
   }

}