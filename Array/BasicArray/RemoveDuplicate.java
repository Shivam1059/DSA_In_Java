import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


class RemoveDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>list = new ArrayList<>();
        
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        for(int i : list){
            System.out.print(i+",");
        }
        System.out.println();

       Set<Integer>seen = new HashSet<>();
       Set<Integer>dupliates = new HashSet<>();

      for(int num : list){
        if(!seen.add(num)){
            dupliates.add(num);
        }
      }
       
       System.out.println("Uniquec items that have Duplicated element : "+dupliates.size());
    }
}