import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Largestelement{
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         List<Integer>list = new ArrayList<>();

         System.out.println("Enter the size of list ");
         int n = sc.nextInt();

         for(int i=0; i<n; i++){
            list.add(sc.nextInt());
         }

         int max = list.get(0);
         for(int i=1; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
         }
         System.err.println("Max element : "+max);
          
      }
}