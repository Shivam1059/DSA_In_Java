/* Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
*/
 import java.util.Scanner;
 class Test{
    public int maxElement(int[]arr){
     int max = -1;
     int second = -1;
     for(int i=0; i<arr.length; i++){
     
         if(max < arr[i]){
           second = max;
           max = arr[i];
         }
        if(arr[i] < max  && arr[i] > second){
             second = arr[i];
        }
            
      }
       return second;
   }
}

class  Ques15{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the size : ");
   int size = sc.nextInt();

   if(size <= 0){
      System.out.println("!input is invalid");
   }
   
   int[]arr = new int[size];
   for(int i=0; i<size; i++){
    System.out.println("Enter the element : ");
    arr[i] = sc.nextInt();

  }
  
   Test t = new Test();
   System.out.println("Third Max Element : "+t.maxElement(arr));

  }
}