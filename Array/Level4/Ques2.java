//You are given a 2D array of integers. Write a Java program to count how many prime numbers //are present in the array.


import java.util.Scanner;
class Test{
   public static boolean checkPrime(int x){
      if(x == 2) return true;
      int i = 2;
      while(i < x/2){
         if(x%i == 0){
          return false;
         }
        i++;
      }
     
      return true;
   }
}
public class Ques2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter the row : ");
    int row = sc.nextInt();
      if(row  <= 0){
    System.out.println("Enter the value : ");
      return;
      }
   
    System.out.print("Enter the col :");
    int col = sc.nextInt();
      if(col <= 0){
      System.out.println("Enter the value : ");
      return;
      }


    int [][] arr = new int[row][col];
    
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
         System.out.println("Enter the value : ");
          arr[i][j] = sc.nextInt();
        }
    }
    int countPrime = 0;
     
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
       int num = arr[i][j];
        System.out.print(num+" ");

            if (Test.checkPrime(num)) {
                    countPrime++;
                }
       }
      System.out.println();
     }
    System.out.println("Total Prime number : "+countPrime);

   }
}