/* . Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
*/
import java.util.*;
class Test{
   public int[] diap(int[]arr){
     Arrays.sort(arr);
     List<Integer> list = new ArrayList<>(); 
     Set<Integer>set = new HashSet<>();
     for( int i : arr){
        set.add(i);
     }
     
     for(int i=1; i<=arr.length; i++){
         if (!set.contains(i)) {
                list.add(i);
            }
      }
     int n = list.size();
     int[]array = new int[n];
     for(int i=0; i<list.size(); i++){
         array[i] = list.get(i);
      }  
    
     return array;
   }
}

class Ques13{
   public  static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size of array : ");
     int size = sc.nextInt();

    if(size <= 0){
        System.out.println("Input is invalid");
    }
    
    int[]arr = new int[size];
   for(int i=0; i<size; i++){
     System.out.println("Enter the element "+i+" : ");
     arr[i] = sc.nextInt();
   }
    for(int j : arr){
      System.out.print(j+",");
    }
   System.out.println(" ");
   Test t = new Test();
    int[] newarr = t.diap(arr);
    
   System.out.println("new array");
   for(int i : newarr){
       System.out.print(i+",");
   }
   }
}