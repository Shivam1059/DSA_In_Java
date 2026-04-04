/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:
Input: 
N = 2
arr[] = {3,4}
Output: 1
*/

import java.util.Scanner;
class Test{
   public static int peekEle(int[]arr){
      int max = arr[0];
      int ans = 0;
      for(int i= 0; i<arr.length; i++){
          if(max < arr[i]){
             max = arr[i];
             ans = i;
           }
      }
     return ans;
   }
}
public class Ques4{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the size of array : ");
     int size = sc.nextInt();
     
     if(size <= 0){
        System.out.println("Input is invalid!");
        return;
     }
     
     int arr[] = new int[size];
     for(int i=0; i<size; i++){
       System.out.print("Enter the element : ");
       arr[i] = sc.nextInt();
     }
    
    System.out.println("Peek element : "+Test.peekEle(arr));
   }  
}