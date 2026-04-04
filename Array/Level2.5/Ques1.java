// Sum of leaders in an array

// Problem Statement
// A function accepts a positive integer array ‘arr’ of size ‘n’ as its argument. Implement the function to find the leaders in the array and return their sum. An element is a leader in the array if it is greater than all the elements to its right side. The rightmost element is always a leader.

// Note
// If ‘arr’ is empty or none(in case of python), return -1
// Output lies within the integer range.

// Example
// Input
// 7
// 52 66 64 36 45 24 32
// Output
// 207

class RightSum{
     public int RightelementSum(int[]arr){
        int sum = 0;
        for(int i=1; i<arr.length; i++){
            int num = arr[i];
            if(num < arr[i-1]){
                sum += arr[i-1];
            }
            if(arr[i] == arr.length-1){
                sum += arr.length-1;
            }
        }
        return sum;
     }
    public int rightElementSum(int[] arr){
         int sum = 0;
         int max = 0;
         for(int i=arr.length-1; i>=0; i--){
            if(max < arr[i]){
                max = arr[i];
                sum += max;
            }
         }
         return sum;
    }
}

public class Ques1{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array : ");
       int size = sc.nextInt();

       if(size <= 0){
        System.out.println("Input is invalid");
       }

       int[] arr = new int[size];
       for(int i=0; i<size; i++){
        System.out.println("Enter the element : ");
        arr[i] = sc.nextInt();
       }

       for(int i : arr){
        System.out.print(i+" ");
       }
       RightSum rs = new RightSum();
       System.out.println("Sum of array : "+rs.rightElementSum(arr));
       System.out.println("Sum of array : "+rs.RightelementSum(arr));
        //52 66 64 36 45 24 32
    }
}