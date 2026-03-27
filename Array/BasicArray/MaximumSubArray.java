import java.util.*;

 class Test{
      public int MaximumSubArray(List<Integer> Newlist){
          int size = Newlist.size();
          int maxSum = Integer.MIN_VALUE;

          for(int i=0; i<size; i++){
              int sum = 0;
            for(int j=i; j<size; j++){
                sum +=  Newlist.get(j);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
          }
          return maxSum;
      }
 }
public class MaximumSubArray{
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array");
         int size = sc.nextInt();

         List<Integer> list = new ArrayList<>();
         for(int i=0; i<size; i++){
            System.out.println("Enter element "+ i+ ": ");
            int num = sc.nextInt();
              list.add(num);
         }

         Test t = new Test();

       System.out.println("MaxSum of SubArray : "+t.MaximumSubArray(list));
      }
}