//Sum of unique elements in Array
// Return 0 if no unique element is found.
// Computed values lie within integer range.

// Example
// Input
// 8
// 2 5 4 7 9 2 4 8
// Output
// 29

import java.util.Scanner;
class Unique{
    public int uniqueSum(int[] arr){
        int sum = 0;
     for(int i=0; i<arr.length; i++){
        int count = 0;
        for(int j=0; j<arr.length; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        if(count == 1){
            sum += arr[i];
        }
     }
     
     return sum;

    }
}
public class  Ques2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Input is invalid!");
        }
        
        int[]arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
        
        Unique q = new Unique();
        System.out.println("Unique Sum : "+q.uniqueSum(arr));
    }
}