import java.util.Scanner;


public class Ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        if(size <= 0){
            System.out.println("Input is invalid!");
        }

       int[]arr = new int[size];

       for(int i=0; i<arr.length; i++){
        System.out.println("Enter the element : ");
        arr[i] = sc.nextInt();
       }
       System.out.println();

       System.out.println("Print array using for loop ");
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }

              System.out.println();

       System.out.println("Print array using for while loop ");
       int t = 0;
       while( t < size){
         System.out.print(arr[t]+" ");
         t++;
       }

              System.out.println();

        System.out.println("Print array using for each loop ");
       for(int k : arr){
         System.out.print(k+" ");
       }
    }
    
}

