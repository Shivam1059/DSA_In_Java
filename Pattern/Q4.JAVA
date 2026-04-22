import java.util.Scanner;
class Q4{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  row : ");
        int row = sc.nextInt();

        if(row <= 0){
            System.out.println("Input is invalid!");
            sc.close();
            return;
        }

        for(int i =0; i<row; i++){
            for( int j=0; j<row; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}