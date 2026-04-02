///5. WAP to read array length and elements from user and reverse that array and display that reversed array.
import java.util.Scanner;

class ReverseArray{
    public int[]  reverseArray(int[]arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
public class Ques5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        
        int[]arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
         for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        ReverseArray ra = new ReverseArray();
        int[]newArr =  ra.reverseArray(arr);

        System.out.print("New Reverse Array : ");
        for(int i : newArr){
            System.out.print(i+" ");
        }
    }
}