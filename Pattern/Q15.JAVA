  import java.util.Scanner;
  class Q15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int row = sc.nextInt();

        System.out.println("Enter the col : ");
        int col = sc.nextInt();

        for(int i=0; i<row; i++){
          
            for(int j=0; j<col; j++){
              if (j >= i && j <= (col - 1 - i)) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
            }
           
            System.out.println();
            
        }
    }
  }
