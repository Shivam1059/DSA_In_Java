import java.util.Scanner;

public class Ques4{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the size of array : ");
       int size = sc.nextInt();

       if(size <= 0){
        System.out.println("Input is invalid!");
       } 
    int[]arr = new int[size];
       for(int i=0; i<size; i++){
          System.out.println("Enter the element : "+i);
          arr[i] = sc.nextInt();
       }
     
    for(int i : arr){
        System.out.print(i+" ");
    }
      System.out.println("Even element : ");
       for(int i : arr){
         if(i%2 == 0){
            System.out.print(i+" ");
         }
       }
    }
}