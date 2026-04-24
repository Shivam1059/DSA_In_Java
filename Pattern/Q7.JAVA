//Hollow Pyramid
import  java.util.Scanner;

class Q7{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int size = sc.nextInt();

    for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
            if(j==0 || j == size-1 || i==0 || i == size-1){
            System.out.print("*"+" ");
            }
            else{
             System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}