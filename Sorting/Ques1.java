//Bubble sort

import java.util.Scanner;
class Sort{
   public int[] bubbleSort(int[]arr){
       int n = arr.length;
      for(int i=0; i<n-1; i++){
          int c = 0;
        for(int j=0; j<n-i-1; j++){
           if(arr[i] > arr[j+1]){
               int temp = arr[i];
                arr[i] = arr[j+1];
                arr[j+1] = temp;
                 c = 1;
           }
        }
        if(c == 0) {
           break;
        }
      }
     return arr;
   }
}

class Ques1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size: ");
    int size = sc.nextInt();

    if(size <= 0){
      System.out.println("Input is invalid");
    }
    
    int[] arr = new int[size];
    for(int i=0; i<size; i++){
      System.out.println("Enter the element : ");
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Unsorted array : ");
    for(int i : arr){
       System.out.print(i+",");
     }
     
    System.out.println();
    Sort s = new Sort();
    int[] newArr = s.bubbleSort(arr);
    
     System.out.print("Sorted array : ");
    for(int j : newArr){
      System.out.print(j+",");
    }
   }
}