/* search insertion position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order

Input: nums = [1,3,5,6], target = 5
Output: 2

*/
import java.util.Scanner;

class Test{
   public int findTarget(int[]arr, int target){
     for(int i=0; i<arr.length; i++){
          if(arr[i] == target)
            return i;  
     }
      return -1;
   }
}
class Ques4{
   public static void main(String[] args){
   Scanner  sc = new Scanner(System.in);

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

  System.out.println("Enter the target : ");
   int target = sc.nextInt();
   
   Test  t = new Test();
    System.out.println("target index "+ t.findTarget(arr, target));
 }
}