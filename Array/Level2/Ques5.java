// WAP to read two 2-D array elements from user and find sum of that two array in third array and display elements of that third array.
import java.util.ArrayList;
import java.util.Scanner;
class Test{
      public int[][]  printArray( int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[row][col];
           
        for(int i=0; i<row; i++){
          for(int j = 0; j<col; j++){
             System.out.println("Enter the element : ");
             arr[i][j] = sc.nextInt();
            }
        }
        return arr;
      }
}

public class Ques5{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     
     System.out.println("For 1 second 2-D array ");
     System.out.println("Enter the row size : ");
     int row = sc.nextInt();

     System.out.println("Enter the col size : ");
     int col = sc.nextInt();
     
     Test t = new Test();

     int[][] arr1 = t.printArray(row, col);
    
     System.out.println("For 2 second 2-D array ");
     System.out.println("Enter the row size : ");
     int row1 = sc.nextInt();

     System.out.println("Enter the col size : ");
     int col1 = sc.nextInt();
     int[][] arr2 = t.printArray(row1, col1);
     

    ArrayList<Integer> list = new ArrayList<>();
    
    System.out.println(" First 2-D array");

     int currSum = 0;
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(arr1[i][j]+" ");
             currSum += arr1[i][j];
            
        }
        System.out.println();
    }
    list.add(currSum);
    System.out.println("  Second 2-D array");
  
    int currSum2 = 0;
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(arr2[i][j]+" ");
            currSum2 += arr2[i][j];
        }
        System.out.println();
    }
     list.add(currSum2);
    System.out.println("Sum of array ");
    for(int k : list){
        System.out.print(k+" ");
    }

    }
}