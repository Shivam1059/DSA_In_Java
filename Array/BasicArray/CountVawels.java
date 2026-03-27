
import java.util.Scanner;

class CountVawels{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the string : ");
         String name = sc.nextLine();

        String str = name.toUpperCase();
        int countVawels = 0;
         for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                countVawels++;
            }
         }
            System.out.println("Total vawels : "+countVawels);
     }
}