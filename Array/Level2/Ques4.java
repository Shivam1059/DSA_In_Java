//WAP to read elements in  2-D array and find maximum and minimum element in that array.
import java.util.Scanner;
class Test{
   public void FindMaxMin(int[][]arr, int row, int col){
      int max = arr[0][0];
      int min = arr[0][0];
      
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            if(max <= arr[i][j]){
                max = arr[i][j];
            }
            if(min > arr[i][j]){
                min = arr[i][j];
            }
        }
      }

      System.out.println("Max Elemenet : "+max);
      System.out.println("Min Element : "+min);
      
   }
}
public class Ques4{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = sc.nextInt();

        System.out.println("Enter the col size : ");
        int col = sc.nextInt();
        
        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter the element  ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Test t = new Test();
        t.FindMaxMin(arr, row, col);
       
    }
}