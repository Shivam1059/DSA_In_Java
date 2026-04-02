//2. WAP to read array length and elements from user and display sum of all the elements of the array.

import java.util.Scanner;

public class Ques2{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int size = sc.nextInt();

        int[] arr= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element : "+i+1);
            arr[i] = sc.nextInt();
        }
         System.out.println();
         
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Array sum : "+sum);

    }
}