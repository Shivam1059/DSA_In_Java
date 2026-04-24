//Trangle
import java.util.Scanner; 
class Q12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int rows = sc.nextInt();
        
        //full Trangle 
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = rows; j > i; j--) {
        //         System.out.print(" ");
        //     }

        //     for(int k = 1; k <= (2 * i - 1); k++) {
        //             System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        //hollow Trangle
        for(int i=0; i<rows; i++){
           for(int j=rows; j>i; j--){
            System.out.println(" ");
           }
           for(int j=0; j<(2*i-1); j++){
                 if(j==i){
                    System.out.print(" ");
                 }else{
                    System.out.println("*"+" ");
                 }
           }
           System.out.println();
        }
    }
}