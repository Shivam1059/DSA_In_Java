/*  Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

*/

import java.util.Scanner;
import java.util.Arrays;
class Test{
    public int[]  squareofSortedArray(int[]arr){
     int n = arr.length;
     int[]newarr = new int[n];

     for(int i=0; i<n; i++){
        newarr[i] = arr[i]*arr[i];

     }
      Arrays.sort(newarr);
      return newarr;
    }
   
   public void printArray(int[]arr){
     System.out.println("\nArray elements are:");
       for(int i: arr){
          System.out.print(i+" ");
       }
      System.out.println();
   }

   public int[] sortedArray(int[]arr){
    int n = arr.length;
    int[]result = new [n];

    int  left = 0;
    int right = n-1;
    int index = n-1;

    while(left < right){
    int leftside = arr[left] * arr[left];
    int rightside = arr[right] * arr[right];
       if(leftside > rightside){
          result[index] = leftside;
          left++;
       }else{
           result[index] = rightside;
           right--;
        }
      index--;
   }
    return result;
  }
}
class Ques17{
  public static void main(String[] args){
   Scanner sc  = new Scanner(System.in);

   System.out.println("Enter the size of array : ");
   int size = sc.nextInt();

   if(size <= 0){
     System.out.println("Input is invalid");
     sc.close();
     return;
   }
   
   int[]arr = new int[size];
   for(int i=0; i<size; i++){
     System.out.println("Enter the element "+i+" : ");
     arr[i] = sc.nextInt();
   }

    Test t = new Test();

    System.out.println("\n Original array :");
    t.printArray(arr);
    
    System.out.println("\nNew Square sorted array :");
    int[] numarr =  t.squareofSortedArray(arr);
    t.printArray(numarr);
   
   sc.close();
  }
}