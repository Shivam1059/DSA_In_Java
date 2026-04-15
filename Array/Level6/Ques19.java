/*  Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]

Output: 2
*/
import java.util.Scanner;

class Test{
   public int findMissingNumber(int[]arr){
     int n = arr.length;

     int expectedSum = (n*(n+1))/2;
     int totalSum = 0;

     for(int i=0; i<arr.length; i++){
          totalSum += arr[i];
       }
    
    return expectedSum - totalSum;
   }

   public void printArray(int[]arr){
    System.out.println("\nOrignal array");
    for(int i=0; i<arr.length; i++){
       System.out.print(arr[i]+", ");
    }
  }

}

class Ques19{
   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of array : ");
   int size = sc.nextInt();

   if(size <= 0){
     System.out.println("Input is invalid!");
     sc.close();
     return;
   }
   
   int[] arr = new int[size];
   for(int i=0; i<size; i++){
      System.out.println("Enter the element "+i+" : ");
      arr[i] = sc.nextInt();
    }
   
   Test t = new Test();
   t.printArray(arr);
   System.out.println("Missing element : "+ t.findMissingNumber(arr) );
   
   sc.close();
  } 
}