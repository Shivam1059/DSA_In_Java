import java.util.Scanner;

class Q17{
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the row : ");
         int row = sc.nextInt();


         System.out.println("Enter the col : ");
         int col = sc.nextInt();

         for(int i=0; i<=row; i++){
              for(int j=0; j<=col; j++){
                if(j<col-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*"+" ");
                }
              }
              System.out.println();
         }
    }
}