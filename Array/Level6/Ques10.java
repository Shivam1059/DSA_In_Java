/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

*/
import java.util.Scanner;

class Test{
   public void swap(int[]arr, int i, int j){
     int temp = arr[i];
     arr[i]  = arr[j];
     arr[j] = temp;
 }
   public int[] moveAllZero(int[]arr){ 
     int n = arr.length;
     int j = 0;
     for(int i=0; i<n; i++){
        if(arr[i] != 0){
          swap(arr, i, j);
         j++;
        }
     }
     return arr;  
  }
}

class Ques10{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

  System.out.println("Enter the size :");
  int size = sc.nextInt();

  if(size <= 0){
   System.out.println("Input is invalid");
  }

   int[]arr = new int[size];
   for(int i=0; i<size; i++){
      System.out.println("Enter the element : ");
      arr[i] = sc.nextInt();
   }
    for(int i: arr){
      System.out.print(i+",");
     }
    System.out.println();

   Test t = new Test();
   int[]newarr = t.moveAllZero(arr);
   for(int i : newarr){
       System.out.print(i+",");
   }
  }
}