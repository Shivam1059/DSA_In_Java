//print the row of start
import java.util.Scanner;
class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int row = sc.nextInt();


        for(int i=0; i<row; i++){
            System.out.println("*"+" ");
        }
    }
}