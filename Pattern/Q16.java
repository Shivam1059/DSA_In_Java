import java.util.Scanner;
class Q16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int row = sc.nextInt();

        System.out.println("Enter the col : ");
        int col = sc.nextInt();

        for(int i=0; i<row; i++){
           
           for(int j=0; j<i; j++){
               if(j==i || j%2 != 0 || i%2!=0){
                 System.out.print(1+" ");
               }else{
                System.out.print(0+" ");
               }
           }
           System.out.println();
        }
    }
}