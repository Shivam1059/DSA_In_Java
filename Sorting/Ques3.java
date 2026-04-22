//hashsort
import java.util.Scanner;
class HashSort{
  public int[] hashSort(int[] arr){
  int n = arr.length;
  int[]newArr = new int[n];
  int j;
   for(int i=1; i<n; i++){
      int k = arr[i];
      for(  j = i-1; j>=0 && k<arr[j]; j--){
         arr[j+1] = arr[j];
      }
      arr[j+1] = k;
   }
   return newArr;
 }

}


public class Ques3{

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int size = sc.nextInt();

    if(size <= 0){
      System.out.println("Input is invalid");
   }
   
   int[]arr = new int[size];
   for(int i=0; i<size; i++){
      System.out.print("Enter the element : ");
      arr[i] = sc.nextInt();
   }
    
    HashSort t = new HashSort();
   
    t.hashSort(arr);

  }

}