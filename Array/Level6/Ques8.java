/* contine duplicate 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

*/
import java.util.Scanner;
import java.util.*;
class Test{
    public static boolean findDuplicate(int[]arr){  
     Arrays.sort(arr);
     for(int i=0; i<arr.length-1; i++){
        if(arr[i] == arr[i+1]){
           return true;
        } 
     }
     return false;

  }
  
  public static boolean findDup(int[]arr){
    Set<Integer> seen = new HashSet<>();
    for(int num : arr){
        if(seen.contains(num)) return true;
         seen.add(num);
     }
    return false;
  }
}


class Ques8{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the size : ");
   int size = sc.nextInt();

   int[]arr = new int[size];
   for(int i=0; i<size; i++){
     System.out.println("Enter the element : ");
     arr[i] = sc.nextInt();
   }
  
   boolean  ans = Test.findDup(arr);
   System.out.println("Ans : "+ans);

 }
}