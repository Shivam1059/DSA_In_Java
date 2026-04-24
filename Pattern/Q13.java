// X start pattern
import java.util.Scanner;
class Q13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        //left Trangle Uppercase
        // for(int i=0; i<size; i++){
        //     for(int j=0; j<size-i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

          //  //right Trangle Upper  case
        //  for(int i=0; i<size; i++){
        //     for(int j=0; j<i; j++ ){
        //         System.out.print("  ");
        //     }
        //     for(int j=0; j<size-i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        //  }


        //Right Trangle Lower case
        // for(int i=0; i<size; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("*"+"  ");
        //     }
        //     System.out.println();
        // }
         
       //left Trangle Lower case
       for(int i=0; i<size; i++){
        for(int j=0; j<size-i; j++){
          System.out.print("  ");
        }
        for(int j=0; j<=i; j++){
          System.out.print("*"+" ");
        }
        System.out.println();
       }

         

    }
}