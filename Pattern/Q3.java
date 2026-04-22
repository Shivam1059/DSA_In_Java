
import java.util.Scanner;
class  Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  row : ");
        int row = sc.nextInt();

        for(int i = 0; i<row; i++){
            for(int j=0; j<row; j++){
                if(i==j)
                System.out.print("*"+" ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}