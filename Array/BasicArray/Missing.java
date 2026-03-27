
import java.util.Scanner;

class Test{
    public int FindMissing(int[] arr){
         int n = arr.length;
         int max = arr[0];
         int sum = 0;
         for(int i=0; i<n; i++){
             sum += arr[i];
              if(max < arr[i]){
                max = arr[i];
              }
         }
         int m = (max*(max - 1))/2;
         return  sum - m;
        
    }

}

public class Missing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[] arr = {1,2,4,5,6};
        Test t = new Test();
        System.out.println("Missing element : "+t.FindMissing(arr));

    }
}