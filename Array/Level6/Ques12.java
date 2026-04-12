/* Maximum Subarray
Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
*/

import java.util.Scanner;

class  Test{
   public static int maxSubarray(int[]arr){
       int maxSum = arr[0];
       int currSum = arr[0];
       for(int i=1; i<arr.length; i++){
            if(arr[i] > currSum + arr[i]){
                currSum = arr[i];
             }
             else{
                currSum = currSum + arr[i];
             }
            
            if(maxSum < currSum ){
               maxSum = currSum;
           }

         }
         return maxSum;
    }
    public  static int maxSumSub(int[]arr){
    int maxSum  = 0;
    for(int i=0; i<arr.length;i++){
       int currSum = 0;
       for(int j =i; j<arr.length; j++){
           currSum += arr[j];
           if(maxSum < currSum){
             maxSum = currSum;
           }
       }
    }
     return maxSum;
   }
}

class Ques12{
  public static void  main(String[] args){ 
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the size : ");
   int size = sc.nextInt();
  
   if(size <= 0){
     System.out.println("Input is invalid");
   }

   int[]arr = new int[size];
   for(int i=0; i<size; i++){
    System.out.println("Enter the element : ");
    arr[i] = sc.nextInt();
   }
  
   System.out.println("MaxSum : "+Test.maxSubarray(arr));
   
 }
}