//trangle pattern

import java.util.Scanner;

class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size : ");
        int size = sc.nextInt();

       //UPPER TRANGLE PATTERN
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
 
          System.out.println();

        //Lower TRANGLE PATTERN
        for(int i=0; i<size; i++){
            for(int j=0; j<i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

      System.out.println();
        //full trangle 
        for(int i=0; i<size; i++){
          
            for(int j=0; j<size; j++){
                if(j=)
            }
            
            System.out.println();
        }
    }
}