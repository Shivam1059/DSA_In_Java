/*
Intersection of Two Arrays
Solved
Easy
Topics
premium lock icon
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/
import java.util.*;

class Test{
     public int[] unique(int[]arr1, int[]arr2){
       Set<Integer> set = new HashSet<>();
       
      
      for(int i=0; i<arr1.length; i++){
         for(int j=0; j<arr2.length; j++){
            if(arr1[i] == arr2[j]){
              set.add(arr1[i]);
            }
         }
      }
      int n = set.size();
       int[] arr = new int[n];
      int k = 0;
      for(int i : set){
         arr[k++] = i;
      }
       return arr;
    }
}

class Ques9{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the size arr1: ");
   int size1 = sc.nextInt();
   
  if(size1 <= 0){
   System.out.println("Input is invalid");
  }
  
  int[]arr1 = new int[size1];
  for(int i=0; i<size1; i++){
   System.out.println("Enter the element : ");
   arr1[i] = sc.nextInt();
  }

  
  System.out.println("Enter the size arr2: ");
   int size2 = sc.nextInt();
   
  if(size2 <= 0){
   System.out.println("Input is invalid");
  }
  
  int[]arr2 = new int[size2];
  for(int i=0; i<size2; i++){
   System.out.println("Enter the element : ");
   arr2[i] = sc.nextInt();
  }

  for(int i : arr1){
     System.out.print(i+" ");
  }
  System.out.println();
    for(int i : arr2){
     System.out.print(i+" ");
  }
System.out.println();
  Test t = new Test();
  int[] newarr = t.unique(arr1, arr2);
  for(int j : newarr){
     System.out.print(j+" ");
  }
 }

}