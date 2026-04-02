import java.util.Scanner;


class ConcatinateArray{
    Scanner sc = new Scanner(System.in);

     public int[] printArray(int size){
        int[] arr = new int[size];
         for(int i=0; i<size; i++){
            System.out.println("Enter the element "+i);
            arr[i] = sc.nextInt();
         }
         return arr;
     }
     
     public int[] concatinateArray(int[]arr1, int[]arr2){
         int size = arr1.length + arr2.length;
         int[] newArray = new int[size];
         for(int i=0; i<arr1.length; i++){
             int num = arr1[i];
             newArray[i] = num;
         }

         for(int j=0; j<arr2.length; j++){
            int num = arr2[j];
            newArray[arr1.length+j] = num;
         }

         return newArray;
     }
     
}

public class Ques3{
    public static void main(String[] args){
       
        ConcatinateArray ca = new ConcatinateArray();
        int[] arr1 = ca.printArray(5);
        int[] arr2 = ca.printArray(6);
        
        int [] arr3 = ca.concatinateArray(arr1, arr2);

        for(int k : arr3){
            System.out.println(arr3[k]);
        }
    }
}