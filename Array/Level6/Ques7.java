/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Input: nums = [4,1,2,1,2]

Output: 4
*/

import java.util.Scanner;
import java.util.*;
class Test{
   public static int findSingleVlaue(int[] arr){
     int ans = 0;
     for(int i: arr){
       ans = ans ^ i;
     }
    return ans;
   }
}

class Ques7{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the size : ");
   int size = sc.nextInt();
  
   if(size <= 0){
      System.out.println("Input is invalid");
   }

   int[] arr = new int[size];
   for(int i=0; i<size; i++){
      System.out.println("Enter the element :");
      arr[i] = sc.nextInt();
    } 
    
   System.out.println("Uniqc value : "+Test.findSingleVlaue(arr));  

  
  }

}