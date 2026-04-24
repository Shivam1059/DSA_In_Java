//Hollow Rectange
import java.util.Scanner;
 class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int  size = sc.nextInt();


        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                if(j==1 || j==size || i==1||i==size){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
 }