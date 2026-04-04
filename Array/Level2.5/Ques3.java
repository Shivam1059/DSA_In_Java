/*
Write a Java program to concatenate two given arrays. Define a method concatenateArrays that takes two integer arrays as arguments and returns a new array containing all elements of the first array followed by all elements of the second array.
Code constraints :
The input arrays can be of any length, including empty.
Sample test cases :
Input 1 :
int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};
Output 1 :
1 2 3 4 5 6 
*/
import java.util.Scanner;
class Concatenate{
    public int[] concatenate(int[]arr1, int[]arr2){
      int n = arr1.length + arr2.length;
      int t = arr1.length;
      int[] arr3 = new int[n];
      for(int i=0; i<arr1.length; i++){
        arr3[i] = arr1[i];
      }      
      for(int j=0; j<arr2.length; j++){
         arr3[t+j] = arr2[j];
      }
      return arr3;
    }
}

public class Ques3{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of arr1 : ");
     int size1 = sc.nextInt();
     
     if(size1 <= 0){
        System.out.println("Input is invalid");
     }
     
     int[] arr1 = new int[size1];
     for(int i=0; i<size1; i++){
         System.out.println("Enter the element : ");
         arr1[i] = sc.nextInt();
     }
     
      System.out.println("Enter the size of arr2 : ");
     int size2 = sc.nextInt();
     
     if(size2 <= 0){
        System.out.println("Input is invalid");
     }

     int[] arr2 = new int[size2];
     for(int i=0; i<size2; i++){
        System.out.println("Enter the element : ");
        arr2[i] = sc.nextInt();
     }
     
     Concatenate c = new Concatenate();
     
    int[] newArr = c.concatenate(arr1, arr2);
     
     for(int i : newArr){
       System.out.print(i+" ");
     }
     
   }
}