/* sum of odd length of array 

Sum of All Odd Length Subarrays
Easy
Topics
premium lock icon
Companies
Hint
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

*/
import java.util.*;
 class Test{
   public int subsequence(int[]arr){
      int totalsum  = 0;
      for(int i=0; i<arr.length; i++){           
         int currSum = 0;
         for(int j=i; j<arr.length; j++){
             currSum += arr[j];    
           int size = j-i+1;;
           if(size%2 != 0){
              totalsum += currSum;
           }
         }
      }
       return totalsum;
    }
}

class Ques16{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter the size : ");
     int size = sc.nextInt();
     
     if(size <= 0){
        System.out.println("Input is invalid!");
      }
     
     int[]arr = new int[size];
     for(int i=0; i<size; i++){
       System.out.println("Enter the element : ");
       arr[i] = sc.nextInt();
     }
    
      Test t = new Test();
      System.out.println("Sum : " + t.subsequence(arr));
  }
}