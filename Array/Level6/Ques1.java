/* TwoSum Problem
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
*/

import java.util.Scanner;
class TwoSum{
    public int[] towSum(int[]arr, int target){
     int[] newarr = new int[2];
    
      int start = 0, end = arr.length-1;
     while(start < end){
        int sum = arr[start] + arr[end];
       if(sum == target){
           newarr[0] = start;
           newarr[1] = end;
         return newarr;
       }else if(sum < target){
           start++;
        }else{
          end--;
       }
    }
     
      return newarr;
  }

}

public class Ques1{
     public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the array size : ");
     int size = sc.nextInt();

     if(size <= 0){
        System.out.println("Input is invalid!");
        return;
     }

      int[] arr = new int[size];

      for(int i=0; i<size; i++){
         System.out.println("Enter the element : "+i);
          arr[i] = sc.nextInt();
       }
     
      System.out.println("Enter the target value : ");
       int target = sc.nextInt();
     
      TwoSum t = new TwoSum();
     int[] result =   t.towSum(arr, target);
      for(int i : result){
       System.out.println(" Indexs : "+i);
     }

  }

}