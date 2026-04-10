//SELECTION SORT

import java.util.Scanner;
class SelectionSort{
   public int[] selectionSort(int[]arr){
      int n = arr.length;
      for(int i=0; i<n-1; i++){
         int min = i;
        for(int j=i+1; j<n; j++){
          if(arr[j] < arr[min]){  
               min = j;
           }
       }
       int  temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
     }
     return arr;
  }
}


class Ques2{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the size : ");
     int size = sc.nextInt();

     if(size <= 0){
        System.out.println("Input is invalid");
      }

      int[] arr = new int[size];
      for(int i=0; i<size; i++){
         System.out.println("Enter the element : ");
         arr[i] = sc.nextInt();
      } 
      SelectionSort  ss = new SelectionSort();
      
     int newArr[] = ss.selectionSort(arr);
     for(int i : newArr){
        System.out.print(i+" ");

     }
   
   }
}