//find the maxSubarray

import java.util.Scanner;
class Test{
    public int  findMaxSubArray(int[]arr){
       int n = arr.length;
       int maxSum = Integer.MIN_VALUE;
       int currSum = 0;
       for(int i=0; i<n; i++){
          currSum += arr[i];
          maxSum = Math.max(maxSum, currSum);

          if(currSum < 0){
            currSum = 0;
          }
       }
       return maxSum;
    }
}
class Q19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[]arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        
        Test t = new Test();
       System.out.println("MaxSum :"+  t.findMaxSubArray(arr));

    }
}