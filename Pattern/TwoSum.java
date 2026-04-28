
import java.util.Arrays;
import java.util.Scanner;

class Test{
    public int[] twopointer(int[]arr, int target){
      Arrays.sort(arr);
       int left = 0, right = arr.length-1;
       while(left < right){
         int currSum = arr[left] + arr[right];
         if(currSum == target){
            return new int[]{left , right};
         }
         else if(currSum < target ){
            left++;
         }
         else{
            right--;
         }
       }
       return new int[0];
    }
}
class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Size of array : ");
        int size = sc.nextInt();
        
        System.out.println("Enter the  target");
        int Target  = sc.nextInt();
        if(size <= 0){
            System.out.println("Input is Invalid!");
            sc.close();
            return;
        }
        
        int[]arr = new int[size];
        for(int i=0; i<size; i++){
           System.out.print("Enter the element : ");
           arr[i] = sc.nextInt();
        }
       
       Test t = new Test();
       int[]nums =  t.twopointer(arr, Target);
       for(int i : nums){
         System.out.print(i+" ");
       }
     
      sc.close();
    }
}