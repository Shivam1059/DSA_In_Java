/* remove elements
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
import java.util.Scanner;

class Ques3{
   public static int removeElement(int[]arr, int value){
    int k = 0;
    for(int i=0; i<arr.length; i++){
       if(arr[i] != value){
           arr[k] = arr[i];
          k++;
       }
   }
    return k;
  }
   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size : ");
   int size = sc.nextInt();
   
    
   if(size <= 0){
    System.out.println("Input is invalid");   
   }
   
   int[] arr = new int[size];
   for(int i=0; i<size; i++){
      System.out.println("Enter the element : ");
      arr[i] = sc.nextInt();
    }
    
     System.out.print("old array : ");

    for(int i : arr){
      System.out.print(i+" ");
   }
       
   System.out.println(" ");
   System.out.println("Enter the element that you remove : ");
   int value = sc.nextInt();
   
   int k = removeElement(arr, value);
   for(int i=0; i<k; i++){
     System.out.print(arr[i]+" ");
   }

  }
}