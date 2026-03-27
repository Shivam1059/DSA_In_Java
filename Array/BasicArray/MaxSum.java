
import java.util.*;
class Test{

    public void MaxSum(ArrayList<Integer>list){
        int maxSum = Integer.MIN_VALUE;
        int a= 0;
        int b = 0;
        for(int i=0; i<list.size(); i++){
            int currsum = 0;
            for(int j=i; j<list.size(); j++){
                 currsum = currsum + list.get(j);
                 if(currsum > maxSum){
                    maxSum = currsum;
                    a = i;
                    b = j;
                 }
            }

        }
        System.out.println("Total sum : "+maxSum);
        System.out.println("Pair "+ a +","+ b);
    }

}

public class MaxSum{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0; i<size; i++){
            System.out.println("Enter the elemet "+i);
            int num = sc.nextInt();
            list.add(num);
        }

       Test t = new Test();
       t.MaxSum(list);
     }
}