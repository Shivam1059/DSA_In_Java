// drow start line
import java.util.Scanner;
class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the line number : ");
        int num  = sc.nextInt();


        for(int i=0; i<num; i++){
            System.out.print("*"+" ");
        }
    }
}