/* 20 mergeSorted array
  
ou are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

*/
import java.util.ArrayList;
import java.util.Arrays;
class Ques20{
    public static void main(String[] args){
    
    int[] num1 = {1,2,3,0,0,0};
    int[] num2 = {2,5,6};
 
    ArrayList<Integer> list = new ArrayList<>();
    
   for(int i : num1){
      if(i > 0) list.add(i);
   }
   for(int i : num2){
      if(i > 0) list.add(i);
   }
 
     int start = 0, end = list.size()-1;
   while(start < end){
     if(list.get(start) > list.get(end)){
        int temp = list.get(start);
        list.get(start) = list.get(end);
        list.get(end) = temp;
        
       start++;
      }else{
        end--;
     }
    }

   for(int i : list){
    System.out.print(i+",");
   }
  

  }
}