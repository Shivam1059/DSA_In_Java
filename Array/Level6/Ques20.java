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

class Test{
  public int[] mergeSorted(int[]arr1, int m , int[]arr2, int n ){
     int index = m + n -1;
     int i = m -1;
     int j = n - 1;

    while( i >= 0 && j >= 0){
        if(arr1[i] >= arr2[j]){
          arr1[index--] = arr1[i--];
        }else{
         arr1[index--] = arr2[j--];
         }
    }
    while( j >= 0){
        arr1[index] = arr2[j];
          index--;
          j--;
     }
     return arr1;
  }
  public void printArray(int[]arr){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
     }
  }
}
class Ques20{
    public static void main(String[] args){
    
    int[] num1 = {1,2,3,0,0,0};
    int[] num2 = {2,5,6};
    int n  = 3;
    int m =  3;

    Test t = new Test();
     int[]arr =  t.mergeSorted(num1,m, num2, n);
     t.printArray(arr);
  
  }
}